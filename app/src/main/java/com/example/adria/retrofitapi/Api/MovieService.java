package com.example.adria.retrofitapi.Api;

import com.example.adria.retrofitapi.Model.MoviesGeneral;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {
    @GET("movie/top_rated")
    Call<MoviesGeneral> getTopRatedMovies(
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );
}
