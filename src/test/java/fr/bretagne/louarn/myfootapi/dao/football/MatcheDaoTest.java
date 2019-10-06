package fr.bretagne.louarn.myfootapi.dao.football;

import fr.bretagne.louarn.myfootapi.IntegrationTest;
import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

public class MatcheDaoTest extends IntegrationTest {

    @Autowired
    private IMatcheDao matcheDao;

    @Test
    public void searcheMatches() throws FootballDaoExeption, DaoExeption {
        matcheDao.searcheMatches();
        assertTrue(true);
    }
}
