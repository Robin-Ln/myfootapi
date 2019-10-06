package fr.bretagne.louarn.myfootapi.dao.football;

import fr.bretagne.louarn.myfootapi.exeption.football.FootballDaoExeption;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import retrofit2.Response;
import retrofit2.Retrofit;

public abstract class AbstractFootballDao<T> extends AbstractDao<T> {

    @Autowired
    Retrofit retrofit;

    @Override
    protected Retrofit getRetrofit() {
        return retrofit;
    }

    protected <R> R getOrElseThrow(Response<R> response) throws FootballDaoExeption {
        if (BooleanUtils.isFalse(response.isSuccessful())) {
            throw new FootballDaoExeption();
        }
        return response.body();
    }

}
