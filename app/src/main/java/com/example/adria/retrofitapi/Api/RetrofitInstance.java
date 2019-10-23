package com.example.adria.retrofitapi.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final String ROOT_URL = "https://api.themoviedb.org/3/";

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static MovieService getApiService() {
        return getRetrofitInstance().create(MovieService.class);
    }
}
