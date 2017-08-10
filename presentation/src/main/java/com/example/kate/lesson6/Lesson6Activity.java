package com.example.kate.lesson6;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kate.R;
import com.example.kate.databinding.ActivityLesson6Binding;

public class Lesson6Activity extends Activity {

    public ObservableField <String> myText= new ObservableField<>("Ура, все работает.");
    private Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ссылка на xml
        ActivityLesson6Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_lesson6);
       //обращение к xml
        binding.setActivity(this);
        binding.text.setText("мой текст");

    }

    @Override
    protected void onResume() {
        super.onResume();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<3; i++){
                    final int a = i;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            myText.set(String.valueOf(a));
                        }
                    });

                }
            }
        });
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
