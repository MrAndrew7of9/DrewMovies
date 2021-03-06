package com.example.android.drewmovies.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

//serilizable to allow transfer of an object instance to an intent
public class Movie implements Serializable {

    private Integer movieId;
    private String movieTitle;
    private String imageUrlPath;
    private String about;
    private String releaseDate;
    private Double userRating;

    public Movie() {

    }

    public Movie (Integer movieId, boolean hasVideo, String movieTitle, String imageUrlpath,
                  String about, String releaseDate, Double userRating) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.imageUrlPath = imageUrlpath;
        this.about = about;
        this.releaseDate = releaseDate;
        this.userRating = userRating;
    }

    //getters
    public Integer getMovieId() {
        return movieId;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public String getImageUrlPath() {
        return imageUrlPath;
    }
    public String getAbout() {
        return about;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public Double getUserRating() {
        return userRating;
    }

    //setters
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public void setImageUrlPath(String imageUrlpath) {
        this.imageUrlPath = imageUrlpath;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void setUserRating(Double userRating) { this.userRating = userRating; }

}
