package fr.bretagne.louarn.myfootapi.config.properties;

import fr.bretagne.louarn.myfootapi.config.modele.ApiProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "football-data-api")
public class FootballApiProperties extends ApiProperties {
}
