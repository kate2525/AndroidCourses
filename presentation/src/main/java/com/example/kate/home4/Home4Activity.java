package com.example.kate.home4;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.kate.R;

public class Home4Activity extends Activity {

    private ImageView imageSova;
    private AnimationDrawable animationDraw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);

        ImageView imageSova = (ImageView)findViewById(R.id.imageSova);
        imageSova.setBackgroundResource(R.drawable.sova);
        animationDraw = (AnimationDrawable)imageSova.getBackground();

//для часов
//        Calendar c =Calendar.getInstance();
//        c.get(Calendar.AM);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,R.anim.back_panel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        animationDraw.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        animationDraw.stop();
    }
}
