package com.example.kate.lesson18;

import android.app.Activity;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.kate.R;

public class Lesson18Activity extends AppCompatActivity {
    //private View viewBackground;
    private View root;
    private Button button1;
    private Button button2;
    private Toolbar tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson18);
      //  viewBackground = (View) findViewById(R.id.viewBackground);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        root =(View)findViewById(R.id.root);
        tool = (Toolbar) findViewById(R.id.tool);


      //  viewBackground.setVisibility(View.VISIBLE);
//        ViewCompat.setZ(viewBackground, 50000);
//        ViewCompat.setZ(button1, 60000);
     //   viewBackground.bringToFront();
        button1.bringToFront();
        root.requestLayout();

        setSupportActionBar(tool);
        tool.setNavigationIcon(R.drawable.ic_live_tv_black_24dp);

//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                ViewCompat.setZ(viewBackground, 70000);
////                ViewCompat.setZ(button2, 80000);
//                viewBackground.bringToFront();
//                button2.getParent().bringChildToFront(button2);
//                button2.bringToFront();
//                root.requestLayout();
//            }
//        });
    }


    //здесь меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lesson18activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //ловить клики меню
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
