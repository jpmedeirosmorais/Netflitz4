package com.company.model;

public class Rating {
    private int score;
    private Movies movie;
    private TvSeries series;

    public Rating(Integer score, Movies movie) {
        this.score = score;
        this.movie = movie;

    }
    public Rating(Integer score, TvSeries series){
        this.score = score;
        this.series = series;

    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }

    public TvSeries getSeries() {
        return series;
    }

    public void setSeries(TvSeries series) {
        this.series = series;
    }
}
