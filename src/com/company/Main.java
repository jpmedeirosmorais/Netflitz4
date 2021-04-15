package com.company;

import com.company.model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Movies movie1 = new Movies("Alone in the dark", 120,"10/10/2008");
        TvSeries tvSeries1 = new TvSeries("Breaking Bad", 5,"10/02/2008");

        User user1 = new User("João Paulo", "paulomedeiros5000@gmail.com", "senha");
        User user2 = new User("Marcos Vinicius", "mvmedeiros@gmail.com","senha");

        user1.createProfile("JP");
        user1.createProfile("Maria C");
        user2.createProfile("MvMedeiros");
        user2.createProfile("Daleee");

        user1.paymentU("Visa","16851684854513", "000", "Joao P M Morais");
        user2.paymentU("Master", "16854354351351", "001", "Marcos Vinicius");

        user1.watch(movie1);
        user1.watch(tvSeries1);

        user2.rate(movie1,8);
        user1.rate(tvSeries1, 10);

/*
        System.out.println(user1.getPaymentU());
        System.out.println(user2.getPaymentU());

        System.out.println(user1.getUserProfile());
        System.out.println(user2.getUserProfile());
*/

    }
}
