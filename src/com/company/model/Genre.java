package com.company.model;

public class Genre {
    private Movies movie;
    private TvSeries series;
    private String genreT;

    public Genre(Movies movie, String genreT) {
        this.movie = movie;
        this.genreT = genreT;
    }
    public Genre(TvSeries series, String genreT){
        this.series = series;
        this.genreT = genreT;
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

    public String getGenreT() {
        return genreT;
    }

    public void setGenreT(String genreT) {
        this.genreT = genreT;
    }
}
