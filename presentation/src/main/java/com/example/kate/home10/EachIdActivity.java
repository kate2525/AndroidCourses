package com.example.kate.home10;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.kate.R;


public class EachIdActivity extends AppCompatActivity {

    private TextView nameN;
    private TextView surnameN;
    private TextView ageN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       // setContentView(R.layout.item_recycle);
        setContentView(R.layout.activity_each_id);

        nameN = (TextView) findViewById(R.id.nameN);
        surnameN = (TextView) findViewById(R.id.surnameN);
        ageN = (TextView) findViewById(R.id.ageN);

        Intent intent = getIntent();
        String name2 = intent.getStringExtra("name");
        String surname2 = intent.getStringExtra("surname");
        int age2 = intent.getIntExtra("age", 0);

        nameN.setText(name2);
        surnameN.setText(surname2);
        ageN.setText(String.valueOf(age2));
    }

    public static void show(Activity activity, String name, String surname, int age) {
        Intent intent = new Intent(activity, EachIdActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("surname", surname);
        intent.putExtra("age", age);
        activity.startActivity(intent);
    }
}
