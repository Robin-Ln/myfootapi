package fr.bretagne.louarn.myfootapi.dao.football;

import fr.bretagne.louarn.myfootapi.IntegrationTest;
import fr.bretagne.louarn.myfootapi.dao.football.modele.Player;
import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;
import lombok.extern.log4j.Log4j;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j
public class IPlayerDaoTest extends IntegrationTest {

    @Autowired
    IPlayerDao playerDao;

    @Test
    public void findPlayer() throws FootballDaoExeption, DaoExeption {
        playerDao.findPlayerById(54);
        Assertions.assertThat(playerDao.findPlayerById(54))
                .extracting(Player::getId)
                .isEqualTo(54);
    }
}
