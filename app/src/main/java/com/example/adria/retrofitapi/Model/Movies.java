package com.example.adria.retrofitapi.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Movies implements Serializable {
    @SerializedName("poster_path")
    public String poster_path;
    @SerializedName("adult")
    public Boolean adult;
    @SerializedName("overview")
    public String overview;
    @SerializedName("release_date")
    public String release_date;
    @SerializedName("id")
    public Integer id;
    @SerializedName("original_title")
    public String original_title;
    @SerializedName("original_language")
    public String original_language;
    @SerializedName("title")
    public String title;
    @SerializedName("backdrop_path")
    public String backdrop_path;
    @SerializedName("popularity")
    public Number popularity;
    @SerializedName("vote_count")
    public Integer vote_count;
    @SerializedName("video")
    public Boolean video;

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public Number getPopularity() {
        return popularity;
    }

    public void setPopularity(Number popularity) {
        this.popularity = popularity;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }
}
