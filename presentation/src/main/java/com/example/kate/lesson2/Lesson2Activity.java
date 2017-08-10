package com.example.kate.lesson2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.kate.R;

public class Lesson2Activity extends Activity {

    public static final String KEY = "zzz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        Intent intent = getIntent();
        int value = intent.getIntExtra(KEY, 0);
        Log.d("value", "value " +value);

    }
}
