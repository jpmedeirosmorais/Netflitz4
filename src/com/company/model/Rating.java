package com.company.model;

public class Rating {
    private int score;
    private Movies movie;
    private TvSeries series;
    private User user;

    public Rating(User user, Movies movie, int score) {
        this.user = user;
        this.score = score;
        this.movie = movie;


    }
    public Rating(User user, TvSeries series, int score){
        this.score = score;
        this.series = series;
        this.user = user;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
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
