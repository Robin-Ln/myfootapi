package fr.bretagne.louarn.myfootapi.dao.football;

import fr.bretagne.louarn.myfootapi.dao.football.modele.MatchesResponse;
import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;

public interface IMatcheDao {
    MatchesResponse searcheMatches(String competition) throws DaoExeption, FootballDaoExeption;
}
