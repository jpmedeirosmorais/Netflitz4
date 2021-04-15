package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class TvSeries {
    private String title;
    private int duration;//seasons
    private String launch;


    private List<Season> season;
    private List<Episode> episode;
    private List<Genre> genre;
    private List<Rating> rating;

    public TvSeries(String title, int duration, String launch) {
        this.title = title;
        this.duration = duration;
        this.launch = launch;
        this.season = new ArrayList<Season>();
        this.episode = new ArrayList<Episode>();
        this.genre = new ArrayList<Genre>();
        this.rating = new ArrayList<Rating>();
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

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public List<Season> getSeason() {
        return season;
    }

    public List<Episode> getEpisode() {
        return episode;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public List<Rating> getRating() {
        return rating;
    }

    public void addRatingSerie(Rating score){
        this.rating.add(score);
    }
}
