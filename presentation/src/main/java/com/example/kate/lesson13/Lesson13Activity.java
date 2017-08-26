package com.example.kate.lesson13;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kate.R;

public class Lesson13Activity extends FragmentActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson13);

        //уже показывается по умолчанию один из фрагментов
        if(savedInstanceState ==null){
            showFragment(getSupportFragmentManager(), new Lesson13Fragment());
        }

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(getSupportFragmentManager(), new Lesson13Fragment());
              //  showFragment(getSupportFragmentManager(),Lesson13Fragment.newInstance(getSupportFragmentManager(),"sss"),true);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(getSupportFragmentManager(), new Lesson13FragmentSecond());

            }
        });
    }

    public static void showFragment(FragmentManager fragmentManager, Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //анимацию подаем в fragmentTransaction
        fragmentTransaction.replace(R.id.container, fragment, fragment.getClass().getName());

        fragmentTransaction.commit();
    }
}
