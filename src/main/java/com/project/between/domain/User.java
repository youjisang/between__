package com.project.between.domain;

/**
 * Created by JisangYou on 2017-11-06.
 */

public class User {

    public String id;
    public String name;
    public String email;
    public String password;
    public String phone;
    public String friend_phone;
    public String message;
    public String token;
    public String notification;
    public String joinDate;
    public String birth;
    public String gender;

    public User() {

    }

    public User(String id, String email, String token) {
        this.id = id;
        this.email = email;
        this.token = token;
    }

    public User(String phone, String friend_phone) {
        this.phone = phone;
        this.friend_phone = friend_phone;
    }

    public User(String id, String name, String email, String password, String phone, String friend_phone, String message, String token, String notification, String joinDate, String birth, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.friend_phone = friend_phone;
        this.message = message;
        this.token = token;
        this.notification = notification;
        this.joinDate = joinDate;
        this.birth = birth;
        this.gender = gender;
    }



}


