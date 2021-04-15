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

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userProfile = new ArrayList<UserProfile>();
        this.paymentU = new ArrayList<Payment>();
        this.favoritesU = new ArrayList<Favorites>();
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
    ////////////////

    //Criação do payment
    public void paymentU(String cardBanner, String cardNumber, String cvv, String name){
        Payment payment = new Payment(this, cardBanner, cardNumber, cvv, name);
        this.addPayment(payment);
    }
    public void addPayment(Payment payment){
        this.paymentU.add(payment);
    }
    /////////////////////


    //Exibição de dados
    @Override
    public String toString(){
        return "User{"+
                "pagamento'" + paymentU+'\'' +
                '}';
    }
}
