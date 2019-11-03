package fr.bretagne.louarn.myfootapi.logging;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum ContentType {

    JSON("application/json"),
    FORM_URLENCODED("x-www-form-urlencoded"),
    FORM_DATA("format-date");

    private String type;

    public static ContentType findByType(String type){
        return Arrays.stream(ContentType.values())
                .filter(contentsType -> contentsType.getType().equals(type))
                .findFirst()
                .orElse(ContentType.JSON);
    }
}
