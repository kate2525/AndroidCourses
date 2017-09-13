package com.example.kate.lesson17;

import javax.inject.Inject;

public class UseCase1 {

    private Rest rest;
    private SharedPreference sharedPreference;

    public UseCase1(Rest rest, SharedPreference sharedPreference) {
        this.rest = rest;
        this.sharedPreference = sharedPreference;
    }

    public String testUseCase1(){
        return "";
    }




}
