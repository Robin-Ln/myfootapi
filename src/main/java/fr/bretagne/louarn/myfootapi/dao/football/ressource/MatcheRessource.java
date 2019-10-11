package fr.bretagne.louarn.myfootapi.dao.football.ressource;

import fr.bretagne.louarn.myfootapi.dao.football.modele.MatchesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MatcheRessource {

    @GET(value = "matches")
    Call<MatchesResponse> searcheMatches(@Query("competitions") String competition);


}
