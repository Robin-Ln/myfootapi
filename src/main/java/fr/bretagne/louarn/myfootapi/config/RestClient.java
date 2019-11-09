package fr.bretagne.louarn.myfootapi.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.bretagne.louarn.myfootapi.config.properties.FootballApiProperties;
import lombok.extern.log4j.Log4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Log4j
@Configuration
public class RestClient {

    private static final String API_KEY = "X-Auth-Token";

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
        // Création du logger
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(log::info);
        httpLoggingInterceptor.level(footballApiProperties.getLevel());
        httpLoggingInterceptor.redactHeader(API_KEY);
        OkHttpClient httpClient = new OkHttpClient
                .Builder()
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .addHeader(API_KEY, footballApiProperties.getApiKey())
                            .build();
                    return chain.proceed(request);
                })
                // Ajout d'un logger
                .addInterceptor(httpLoggingInterceptor)
                //.addInterceptor(new LoggingInterceptor(HttpLoggingInterceptor.Level.BODY, log::info))
                .build();
        return new Retrofit.Builder()
                .baseUrl(footballApiProperties.getBasePath())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .client(httpClient)
                .build();
    }
}
