package com.company;

import com.company.model.Payment;
import com.company.model.User;
import com.company.model.UserProfile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("João Paulo", "paulomedeiros5000@gmail.com", "senha");
        User user2 = new User("Marcos Vinicius", "mvmedeiros@gmail.com","senha");


        user1.createProfile("JP");
        user1.createProfile("Maria C");
        user2.createProfile("MvMedeiros");
        user2.createProfile("Daleee");

        user1.paymentU("Visa","16851684854513", "000", "Joao P M Morais");
        user2.paymentU("Master", "16854354351351", "001", "Marcos Vinicius");

/*
        System.out.println(user1.getPaymentU());
        System.out.println(user2.getPaymentU());

        System.out.println(user1.getUserProfile());
        System.out.println(user2.getUserProfile());
*/
        for(int i = 0; i<user1.getPaymentU().size(); i++) {
            System.out.println(user1.getPaymentU());
        }







    }
}
