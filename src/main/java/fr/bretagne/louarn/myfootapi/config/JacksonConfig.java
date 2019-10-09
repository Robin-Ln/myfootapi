package fr.bretagne.louarn.myfootapi.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import fr.bretagne.louarn.myfootapi.mapper.LocalDateTimeSerializer;
import fr.bretagne.louarn.myfootapi.mapper.LocalDatetimeDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDateTime;

@Configuration
public class JacksonConfig {

    @Bean
    public SimpleModule simpleModule() {
        SimpleModule simpleModule = new SimpleModule();

        simpleModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        simpleModule.addDeserializer(LocalDateTime.class, new LocalDatetimeDeserializer());

        return simpleModule;
    }


    @Bean
    @Primary
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder, SimpleModule simpleModule) {
        ObjectMapper objectMapper = builder.build();
        objectMapper.registerModule(simpleModule);
        return objectMapper;
    }

}
