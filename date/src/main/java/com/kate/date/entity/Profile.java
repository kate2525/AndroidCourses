package com.kate.date.entity;

//ответы от рест. Будет парситься из json данные

import com.google.gson.annotations.SerializedName;

public class Profile implements DataModel{

    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private int age;

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
}
