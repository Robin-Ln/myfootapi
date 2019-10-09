package fr.bretagne.louarn.myfootapi.dao.football.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MatchesResponse {

    private List<Match> matches;

    private BigInteger count;

    private Filters filters;

}
