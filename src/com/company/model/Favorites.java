package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Favorites {
    private User user;

    private List<TvSeries> favoriteSeries;
    private List<Movies> favoriteMovies;

    public Favorites(User user) {
        this.user = user;
        this.favoriteSeries = new ArrayList<TvSeries>();
        this.favoriteMovies = new ArrayList<Movies>();
    }

    public void addSeries(TvSeries addSeries){
        this.favoriteSeries.add(addSeries);
    }
    public void addMovie(Movies addMovie){
        this.favoriteMovies.add(addMovie);
    }

}
