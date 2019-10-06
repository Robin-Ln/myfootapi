package fr.bretagne.louarn.myfootapi.dao.football.modele;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Filters {

    private LocalDate dateFrom;

    private LocalDate dateTo;

    private String permission;

}
