package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    private String title;
    private int duration;
    private String launch;

    private List <Genre> genre;
    private List<Rating> rating;

    public Movies(String title, int duration, String launch) {
        this.title = title;
        this.duration = duration;
        this.launch = launch;
        this.genre = genre;
        this.rating = rating;
        this.rating = new ArrayList<Rating>();
        this.genre = new ArrayList<Genre>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLaunch() {
        return launch;
    }

    public void addRatingMovie(Rating ratingAdd){
        this.rating.add(ratingAdd);
    }
    public void addGenre(Genre genreAdd){
        this.genre.add(genreAdd);
    }
}
