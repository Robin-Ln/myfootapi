package fr.bretagne.louarn.myfootapi.dao.football.impl;

import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import lombok.extern.log4j.Log4j;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.PostConstruct;

@Log4j
public abstract class AbstractDao<T> {

    T ressource;

    @PostConstruct
    public void init() {
        ressource = getRetrofit().create(getClazz());
    }

    protected abstract Retrofit getRetrofit();

    protected abstract Class<T> getClazz();

    <R> Response<R> execute(Call<R> call) throws DaoExeption {
        try {
            return call.execute();
        } catch (Exception e) {
            throw new DaoExeption(e);
        }
    }

}
