package fr.bretagne.louarn.myfootapi.dao.football.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Player {
    private Integer id;
    private String name;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String countryOfBirth;
    private String nationality;
    private String position;
    private LocalDateTime lastUpdated;
}
