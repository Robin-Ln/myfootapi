package fr.bretagne.louarn.myfootapi.exeption.football;

import fr.bretagne.louarn.myfootapi.dao.football.modele.FootballError;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FootballDaoExeption extends Exception{

    private FootballError footballError;

}
