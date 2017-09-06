package com.example.kate.home14;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ParseJson {


    private static String way(Context context){
        String json = null;
        try {
            InputStream inputStream = context.getAssets().open("countries.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    //распарсим используя gson
    public static List<Countries> jsonParse (Context context) {
        String json = way(context);
        if(json == null) return null;

        Gson gson = new GsonBuilder().create();
        List<Countries> countries = gson.fromJson(json, new TypeToken<List<Countries>>(){}.getType());
        return countries;
    }

//    public static void test() {
//        List<Countries> countries = ParseJson.jsonParse(activity|fragment);
//    }


}
