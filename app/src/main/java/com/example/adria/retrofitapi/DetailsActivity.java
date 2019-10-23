package com.example.adria.retrofitapi;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adria.retrofitapi.Model.Movies;
import com.example.adria.retrofitapi.Views.MainActivity;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {
    private Movies movies;
    @BindView(R.id.movie_activity_poster) ImageView movie_activity_poster;
    @BindView(R.id.original_title) TextView original_title;
    @BindView(R.id.release_date) TextView release_date;
    @BindView(R.id.vote_count) TextView vote_count;
    @BindView(R.id.overview) TextView overview;
    Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        setupActionBar();

        movies = (Movies) getIntent().getSerializableExtra("data");
        detailsMovies(movies);

    }

    private void detailsMovies(Movies oMovie){
        Picasso.get().load(MainActivity.moviePathUrl(oMovie.getPoster_path())).into(movie_activity_poster);
        original_title.setText(String.valueOf(oMovie.getTitle()));
        release_date.setText(String.valueOf(oMovie.getRelease_date()));
        vote_count.setText(String.valueOf(oMovie.getVote_count()));
        overview.setText(String.valueOf(oMovie.getOverview()));
    }
    private void setupActionBar(){
        ActionBar actionbar = getSupportActionBar();
        if(actionbar !=null){
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setTitle("Details Movie");
        }
    }
}
