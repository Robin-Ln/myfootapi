package fr.bretagne.louarn.myfootapi.mapper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

@Log4j
public class LocalDatetimeDeserializer extends JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        String str = p.getText();
        try {
            return LocalDateTime.parse(str, LocalDateTimeSerializer.DATE_FORMATTER);
        } catch (DateTimeParseException e) {
            log.error(e);
            return null;
        }
    }
}
