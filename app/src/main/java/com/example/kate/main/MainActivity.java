package com.example.kate.main;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kate.R;
import com.example.kate.home1.Home1Activity;
import com.example.kate.home2.Home2Activity;

public class MainActivity extends Activity {
    private Button home1Button;
    private Button home2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home1Button = (Button) findViewById(R.id.home1Button);
        home2Button = (Button) findViewById(R.id.home2Button);

        home1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home1Activity.class);
                startActivity(intent);
            }
        });
        home2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home2Activity.class);
                startActivity(intent);
            }
        });


    }
}
