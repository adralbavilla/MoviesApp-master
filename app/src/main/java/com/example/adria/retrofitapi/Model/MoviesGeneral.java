package com.example.adria.retrofitapi.Model;

import com.example.adria.retrofitapi.Model.Movies;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MoviesGeneral {
    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private ArrayList<Movies> movieResult;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public ArrayList<Movies> getMovieResult() {
        return movieResult;
    }

    public void setMovieResult(ArrayList<Movies> movieResult) {
        this.movieResult = movieResult;
    }
}
