package com.example.dbtest;

import org.apache.ibatis.type.Alias;

@Alias(value = "user")
public class User {

    private Long id;

    private String userName = null;

    private String note = null;

    public User() {
        System.out.print("--------Construct User");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
