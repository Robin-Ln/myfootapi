package fr.bretagne.louarn.myfootapi.dao.football.impl;

import fr.bretagne.louarn.myfootapi.dao.football.IMatcheDao;
import fr.bretagne.louarn.myfootapi.dao.football.modele.MatchesResponse;
import fr.bretagne.louarn.myfootapi.dao.football.ressource.MatcheRessource;
import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;
import org.springframework.stereotype.Repository;
import retrofit2.Response;

@Repository
public class MatcheDaoImpl extends AbstractFootballDao<MatcheRessource> implements IMatcheDao {

    @Override
    public MatchesResponse searcheMatches(String competition) throws DaoExeption, FootballDaoExeption {
        Response<MatchesResponse> response = execute(ressource.searcheMatches(competition));
        return getOrElseThrow(response);
    }

    @Override
    protected Class<MatcheRessource> getClazz() {
        return MatcheRessource.class;
    }
}
