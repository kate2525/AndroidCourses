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
import com.example.kate.home3.Home3Activity;
import com.example.kate.home4.Home4Activity;
import com.example.kate.home5.Home5Activity;
import com.example.kate.home6.Home6Activity;
import com.example.kate.lesson2.Lesson2Activity;
import com.example.kate.lesson3.Lesson3Activity;
import com.example.kate.lesson4.Lesson4Activity;
import com.example.kate.lesson5.Lesson5Activity;
import com.example.kate.lesson6.Lesson6Activity;
import com.example.kate.lesson7.Lesson7Activity;

public class MainActivity extends Activity {
    private Button home1Button;
    private Button home2Button;
    private Button home3Button;
    private Button home4Button;
    private Button home5Button;
    private Button home6Button;
    private Button lesson2Button;
    private Button lesson3Button;
    private Button lesson4Button;
    private Button lesson5Button;
    private Button lesson6Button;
    private Button lesson7Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home1Button = (Button) findViewById(R.id.home1Button);
        home2Button = (Button) findViewById(R.id.home2Button);
        home3Button = (Button) findViewById(R.id.home3Button);
        home4Button = (Button) findViewById(R.id.home4Button);
        home5Button = (Button) findViewById(R.id.home5Button);
        home6Button = (Button) findViewById(R.id.home6Button);
        lesson2Button = (Button) findViewById(R.id.lesson2Button);
        lesson3Button = (Button) findViewById(R.id.lesson3Button);
        lesson4Button = (Button) findViewById(R.id.lesson4Button);
        lesson5Button = (Button) findViewById(R.id.lesson5Button);
        lesson6Button = (Button) findViewById(R.id.lesson6Button);
        lesson7Button = (Button) findViewById(R.id.lesson7Button);

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
        home3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home3Activity.class);
                startActivity(intent);
            }
        });
        home4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home4Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right,R.anim.left);
            }
        });
        home5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home5Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right,R.anim.left);
            }
        });
        home6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home6Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right,R.anim.left);
            }
        });
        lesson2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson2Activity.class);
                intent.putExtra(Lesson2Activity.KEY, 90);
                startActivity(intent);
            }
        });
        lesson3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson3Activity.class);
                startActivity(intent);
            }
        });
        lesson4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson4Activity.class);
                startActivity(intent);
            }
        });
        lesson5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson5Activity.class);
                startActivity(intent);
            }
        });
        lesson6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson6Activity.class);
                startActivity(intent);
            }
        });
        lesson7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson7Activity.class);
                startActivity(intent);
            }
        });


    }
}
