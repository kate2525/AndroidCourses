package com.kate.date.databaseEntity;

/**
 * Created by kate on 04.09.2017.
 */

public class User {
    private int id;
    private String name;
    private int age;
    private Country countryPoUser;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountryPoUser() {
        return countryPoUser;
    }

    public void setCountryPoUser(Country countryPoUser) {
        this.countryPoUser = countryPoUser;
    }
}
