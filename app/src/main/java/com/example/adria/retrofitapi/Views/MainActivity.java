package com.example.adria.retrofitapi.Views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.adria.retrofitapi.Api.MovieService;
import com.example.adria.retrofitapi.Model.Movies;
import com.example.adria.retrofitapi.Model.MoviesGeneral;
import com.example.adria.retrofitapi.R;
import com.example.adria.retrofitapi.Api.RetrofitInstance;
import com.example.adria.retrofitapi.Adapters.ViewPagerAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String API_KEY = "7ef1d04b7d81e49d88fbc2dea993e6dd";
    public static final String language = "en-US";
    List<Movies> imageUrls;
    ArrayList<String> stringArrayList = new ArrayList<String>();
    TextView txtView;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MovieService api = RetrofitInstance.getApiService();

        Call<MoviesGeneral> call = api.getTopRatedMovies(API_KEY,language,1);

        call.enqueue(new Callback<MoviesGeneral>() {
            @Override
            public void onResponse(@NonNull Call<MoviesGeneral> call, @NonNull Response<MoviesGeneral> response) {
                if (response.isSuccessful()) {
                    Gson gson = new Gson();
                    String successResponse = gson.toJson(response.body());
                    Log.i("successResponse: " , successResponse);


                    ArrayList<Movies> movies = response.body().getMovieResult();
                       for(Movies movie : movies){
                           stringArrayList.add(moviePathUrl(movie.getPoster_path()));
                       }

                    ViewPager viewPager = findViewById(R.id.view_pager);
                    ViewPagerAdapter adapter = new ViewPagerAdapter(MainActivity.this,stringArrayList,movies);
                    viewPager.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<MoviesGeneral> call, Throwable t) {

            }
        });
    }

    public static String moviePathUrl(String imagePath) {
        return "https://image.tmdb.org/t/p/w500" + imagePath;
    }
}
