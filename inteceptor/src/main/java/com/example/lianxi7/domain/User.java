package com.example.lianxi7.domain;

import java.util.Date;

public class User {
    private String id;
    private String username;
    private Date date;
    private String bir;


    public User() {
    }

    public User(String id, String username, Date date, String bir) {
        this.id = id;
        this.username = username;
        this.date = date;
        this.bir = bir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }
}
