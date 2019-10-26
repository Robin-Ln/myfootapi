package fr.bretagne.louarn.myfootapi.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "football-data-api")
public class FootballApiProperties extends ApiProperties {
}
