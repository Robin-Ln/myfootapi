package fr.bretagne.louarn.myfootapi.dao.football;

import fr.bretagne.louarn.myfootapi.exeption.DaoExeption;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.PostConstruct;

public abstract class AbstractDao<T> {

    protected T ressource;

    @PostConstruct
    public void init() {
        ressource = getRetrofit().create(getClazz());
    }

    protected abstract Retrofit getRetrofit();

    protected abstract Class<T> getClazz();

    protected <R> Response<R> execute(Call<R> call) throws DaoExeption {
        try {
            return call.execute();
        } catch (Exception e) {
            throw new DaoExeption(e);
        }
    }

}
