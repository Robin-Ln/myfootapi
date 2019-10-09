package fr.bretagne.louarn.myfootapi.dao.football;

import fr.bretagne.louarn.myfootapi.IntegrationTest;
import fr.bretagne.louarn.myfootapi.dao.football.modele.MatchesResponse;
import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

@Log4j
public class MatcheDaoTest extends IntegrationTest {

    @Autowired
    private IMatcheDao matcheDao;

    @Test
    public void searcheMatches() throws FootballDaoExeption, DaoExeption {
        MatchesResponse matchesResponse = matcheDao.searcheMatches();
        log.info(matchesResponse);
        assertTrue(Objects.nonNull(matchesResponse));
    }
}
