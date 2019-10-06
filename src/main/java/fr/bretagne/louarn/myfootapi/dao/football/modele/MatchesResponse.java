package fr.bretagne.louarn.myfootapi.dao.football.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MatchesResponse {

    private List<Match> matches;

    private BigInteger count;

    private Filters filters;

}
