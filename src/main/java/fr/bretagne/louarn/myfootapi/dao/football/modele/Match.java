package fr.bretagne.louarn.myfootapi.dao.football.modele;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Match {
    private BigInteger id;
    private Competition competition;
    private Saison saison;
    private LocalDateTime utcDate;
    private String status;
    private BigInteger matchday;
    private String stage;
    private String group;
    private LocalDateTime lastUpdated;
    private Score score;
    private Team homeTeam;
    private Team awayTeam;

}
