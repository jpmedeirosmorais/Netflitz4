package com.company.model;

public class Payment {
    private User user;
    private String cardBanner;
    private String cardNumber;
    private String cvv;
    private String name;

    public Payment(User user, String cardBanner, String cardNumber, String cvv, String name) {
        this.user = user;
        this.cardBanner = cardBanner;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.name = name;
    }

    public String getCardBanner() {
        return cardBanner;
    }

    public void setCardBanner(String cardBanner) {
        this.cardBanner = cardBanner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    @Override
    public String toString(){
        return "User{"+
                "pagamento'" + cardBanner+'\'' +
                '}';
    }

 */
}
