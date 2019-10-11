package fr.bretagne.louarn.myfootapi.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.bretagne.louarn.myfootapi.config.properties.FootballApiProperties;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class RestClient {

    private final FootballApiProperties footballApiProperties;

    private final ObjectMapper objectMapper;

    @Autowired
    public RestClient(FootballApiProperties footballApiProperties,
                      ObjectMapper objectMapper) {
        this.footballApiProperties = footballApiProperties;
        this.objectMapper = objectMapper;
    }

    @Primary
    @Bean(name = "footballApi")
    public Retrofit footballApi() {
        OkHttpClient httpClient = new OkHttpClient
                .Builder()
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .addHeader("X-Auth-Token", footballApiProperties.getApiKey())
                            .build();
                    return chain.proceed(request);
                })
                .build();
        return new Retrofit.Builder()
                .baseUrl(footballApiProperties.getBasePath())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .client(httpClient)
                .build();
    }
}
