package com.example.anggi.anggi_priatna_1202150042_modul6.model;

/**
 * Created by Anggi on 4/1/2018.
 */

public class Comment {
    String id;
    String username;
    String comment;

    public Comment(){}

    public Comment(String id, String username, String comment) {
        this.id = id;
        this.username = username;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
