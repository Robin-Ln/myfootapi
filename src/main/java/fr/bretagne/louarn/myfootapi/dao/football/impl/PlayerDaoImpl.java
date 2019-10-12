package fr.bretagne.louarn.myfootapi.dao.football.impl;

import fr.bretagne.louarn.myfootapi.dao.football.IPlayerDao;
import fr.bretagne.louarn.myfootapi.dao.football.modele.Player;
import fr.bretagne.louarn.myfootapi.dao.football.ressource.PlayerRessource;
import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;
import org.springframework.stereotype.Repository;
import retrofit2.Response;

@Repository
public class PlayerDaoImpl extends AbstractFootballDao<PlayerRessource> implements IPlayerDao {

    @Override
    public Player findPlayerById(Integer id) throws DaoExeption, FootballDaoExeption {
        Response<Player> response = execute(ressource.findPlayerById(id));
        return getOrElseThrow(response);
    }

    @Override
    protected Class<PlayerRessource> getClazz() {
        return PlayerRessource.class;
    }
}
