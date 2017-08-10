package com.example.kate.home1;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kate.R;

public class Home1Activity extends Activity {

    private Button buttonChange;
    private TextView textСhange1;
    private TextView textСhange2;
    private String text;

    private View.OnClickListener change = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            changeText();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home1);
        Log.d("onCreate", "onCreate()");

        buttonChange = (Button) findViewById(R.id.buttonChange);
        textСhange1 = (TextView) findViewById(R.id.textСhange1);
        textСhange2 = (TextView) findViewById(R.id.textСhange2);


        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText();
            }
        });

        textСhange1.setOnClickListener(change);

        textСhange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText();
            }
        });
    }

    void changeText() {
        text = (String) textСhange1.getText();
        textСhange1.setText(textСhange2.getText());
        textСhange2.setText(text);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart", "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop", "onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "onPause()");
    }
}
