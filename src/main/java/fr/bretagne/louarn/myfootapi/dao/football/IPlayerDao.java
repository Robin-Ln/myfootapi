package fr.bretagne.louarn.myfootapi.dao.football;

import fr.bretagne.louarn.myfootapi.dao.football.modele.Player;
import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;

public interface IPlayerDao {
    Player findPlayerById(Integer id) throws DaoExeption, FootballDaoExeption;
}
