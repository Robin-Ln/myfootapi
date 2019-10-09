package fr.bretagne.louarn.myfootapi.dao.football.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Filters {

    private LocalDate dateFrom;

    private LocalDate dateTo;

    private String permission;

}
