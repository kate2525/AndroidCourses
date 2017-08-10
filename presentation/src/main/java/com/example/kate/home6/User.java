package com.example.kate.home6;


import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.graphics.Color;

public class User {

    public String url ="http://cs3.pikabu.ru/post_img/2014/04/03/10/1396542129_252938718.jpg";
    public String name = "Маша";
    public int age = 18;
    public boolean woman = true;
    public ObservableInt color = new ObservableInt(Color.parseColor("#c82222"));

    public void onClick(){
        if(woman==true){
            woman=false;
            color.set(Color.parseColor("#c82222"));
        }else {
            woman = true;
            color.set(Color.parseColor("#486bb2"));
        }
    }

}
