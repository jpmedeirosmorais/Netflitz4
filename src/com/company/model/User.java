package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String password;
    private Payment p;

    private List<UserProfile> userProfile;
    private List<Payment> paymentU;
    private List<Favorites> favoritesU;
    private List<Movies> movies;
    private List<Movies> watchedMovies;
    private List<TvSeries> tvSeries;
    private List<TvSeries> watchedSeries;
    private List<Rating> rate;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userProfile = new ArrayList<UserProfile>();
        this.paymentU = new ArrayList<Payment>();
        this.favoritesU = new ArrayList<Favorites>();
        this.movies = new ArrayList<Movies>();
        this.tvSeries = new ArrayList<TvSeries>();
        this.watchedMovies = new ArrayList<Movies>();
        this.watchedSeries = new ArrayList<TvSeries>();
        this.rate = new ArrayList<Rating>();
    }
    //Asiste a midia
    public void watch(Movies movie) {
        this.watchedMovies.add(movie);
    }
    public void watch(TvSeries serie) {
        this.watchedSeries.add(serie);
    }

    //Avaliação de midia.
    public void rate(Movies movie, int score){
        Rating scoreM = new Rating(this, movie, score);
        movie.addRatingMovie(scoreM);
        this.addRatingMovie(scoreM);
    }
    public void addRatingMovie(Rating scoreM){
        this.rate.add(scoreM);
    }

    public void rate(TvSeries serie, int score){
        Rating scoreS = new Rating(this, serie, score);
        serie.addRatingSerie(scoreS);
        this.addRatingSerie(scoreS);
    }

    public void addRatingSerie(Rating scoreS){
        this.rate.add(scoreS);
    }

    //criação do favorite
    public void createFavorite(){

    }

    //Criação do profile
    public void createProfile(String nickName){
        UserProfile profileAdd = new UserProfile(this, nickName);
        this.addUserProfile(profileAdd);
    }

    public void addUserProfile(UserProfile profileAdd){
        this.userProfile.add(profileAdd);
    }


    //Criação do payment
    public void paymentU(String cardBanner, String cardNumber, String cvv, String name){
        Payment payment = new Payment(this, cardBanner, cardNumber, cvv, name);
        this.addPayment(payment);
    }
    public void addPayment(Payment payment){
        this.paymentU.add(payment);
    }

    public List<Rating> getRate() {
        return rate;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public List<Movies> getWatchedMovies() {
        return watchedMovies;
    }

    public List<TvSeries> getTvSeries() {
        return tvSeries;
    }

    public List<TvSeries> getWatchedSeries() {
        return watchedSeries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Payment> getPaymentU() {
        return paymentU;
    }

    public List<UserProfile> getUserProfile() {
        return userProfile;
    }

    public List<Favorites> getFavoritesU() {
        return favoritesU;
    }

    //Exibição de dados
    @Override
    public String toString(){
        return "User{"+
                "pagamento'" + paymentU+'\'' +
                '}';
    }


}
