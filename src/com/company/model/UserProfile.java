package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private User user;
    private String nickName;

    public UserProfile(User user, String nickName) {
        this.user = user;
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Nick name:"+nickName +", email da conta:" +user.getEmail()+"\n";
    }
}
