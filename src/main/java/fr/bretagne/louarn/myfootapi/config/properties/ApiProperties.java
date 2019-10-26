package fr.bretagne.louarn.myfootapi.config.properties;

import lombok.Getter;
import lombok.Setter;
import okhttp3.logging.HttpLoggingInterceptor;


@Getter
@Setter
public class ApiProperties {
    private String basePath;
    private String apiKey;
    private HttpLoggingInterceptor.Level level;
}
