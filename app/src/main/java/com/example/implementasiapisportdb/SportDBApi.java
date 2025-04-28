package com.example.implementasiapisportdb;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface SportDBApi {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TeamResponse> getTeams();
}
