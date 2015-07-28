package com.gooker.databinding.domain;

import java.util.Date;

/**
 * Created by sczhang on 15/7/28. 下午5:11
 * Package Name com.gooker.databinding.domain
 * Project Name DataBinding
 */
public class User {

    private int id;
    private String name;
    private char ch;
    private Date birthday;
    private String address;

    public User() {
    }

    public User(int id, String name, char ch, Date birthday, String address) {
        this.id = id;
        this.name = name;
        this.ch = ch;
        this.birthday = birthday;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ch=" + ch +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
