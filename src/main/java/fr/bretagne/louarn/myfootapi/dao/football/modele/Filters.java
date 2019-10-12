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

    private Integer id;
    private Integer matchday;
    private Status status;
    private Venue venue;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String stage;
    private LocalDate season;
    private String permission;
    private String plan;
    private String limit;
}
