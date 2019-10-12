package fr.bretagne.louarn.myfootapi.dao.football.ressource;

import fr.bretagne.louarn.myfootapi.dao.football.modele.Player;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PlayerRessource {

    @GET(value = "players/{id}")
    Call<Player> findPlayerById(@Path("id") Integer id);

}
