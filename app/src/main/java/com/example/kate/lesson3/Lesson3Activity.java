package com.example.kate.lesson3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kate.R;
//my view
public class Lesson3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        //анимация
//        overridePendingTransition(R.anim.name, R.anim.name2);
//        startActivity();


    }

    //анимация возврата на предыдущую активити
//    @Override
//    public void onBackPressed() {
//        overridePendingTransition(R.anim.name, R.anim.name2);
//    }
}
