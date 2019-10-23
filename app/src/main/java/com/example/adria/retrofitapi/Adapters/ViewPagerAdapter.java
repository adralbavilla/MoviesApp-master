package com.example.adria.retrofitapi.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.adria.retrofitapi.DetailsActivity;
import com.example.adria.retrofitapi.Model.Movies;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {
    public Context context;
    public ArrayList<String> imageUrls;
    public ArrayList<Movies> movies;

    public ViewPagerAdapter(Context context,  ArrayList<String> imageUrls, ArrayList<Movies> movies) {
        this.context = context;
        this.imageUrls = imageUrls;
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        ImageView imageView = new ImageView(context);
        Picasso.get()
                .load(imageUrls.get(position))
                .fit()
                .centerCrop()
                .into(imageView);
        container.addView(imageView);

        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("data",  movies.get(position));
                context.startActivity(intent);

            }
        });
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
