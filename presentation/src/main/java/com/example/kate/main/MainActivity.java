package com.example.kate.main;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.kate.R;
import com.example.kate.home1.Home1Activity;
import com.example.kate.home10.Home10Activity;
import com.example.kate.home14.Home14Activity;
import com.example.kate.home2.Home2Activity;
import com.example.kate.home3.Home3Activity;
import com.example.kate.home4.Home4Activity;
import com.example.kate.home5.Home5Activity;
import com.example.kate.home6.Home6Activity;
import com.example.kate.home9.Home9Activity;
import com.example.kate.lesson13.Lesson13Activity;
import com.example.kate.lesson14.Lesson14Activity;
import com.example.kate.lesson15.Lesson15Activity;
import com.example.kate.lesson16.Lesson16Activity;
import com.example.kate.lesson2.Lesson2Activity;
import com.example.kate.lesson3.Lesson3Activity;
import com.example.kate.lesson4.Lesson4Activity;
import com.example.kate.lesson5.Lesson5Activity;
import com.example.kate.lesson6.Lesson6Activity;
import com.example.kate.lesson7.Lesson7Activity;
import com.example.kate.lesson8.Lesson8Activity;
import com.example.kate.lessson12.Lesson12Activity;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;


public class MainActivity extends Activity {


//    private PublishSubject<String> publishSubject = PublishSubject.create();
//    private BehaviorSubject<String> behaviorSubject = BehaviorSubject.create();
//    private ReplaySubject<String> replaySubject = ReplaySubject.create();

    private Button home1Button;
    private Button home2Button;
    private Button home3Button;
    private Button home4Button;
    private Button home5Button;
    private Button home6Button;
    private Button home9Button;
    private Button home10Button;
    private Button home14Button;
    private Button lesson2Button;
    private Button lesson3Button;
    private Button lesson4Button;
    private Button lesson5Button;
    private Button lesson6Button;
    private Button lesson7Button;
    private Button lesson8Button;
    private Button lesson12Button;
    private Button lesson13Button;
    private Button lesson14Button;
    private Button lesson15Button;
    private Button lesson16Button;
    //private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        publishSubject.onNext("Один");
//        publishSubject.onNext("Два");
//        publishSubject.onNext("Три");
//        publishSubject.onNext("Четыре");
//
//        disposable = publishSubject.subscribeWith(new DisposableObserver<String>() {
//            @Override
//            public void onNext(@NonNull String s) {
//                Log.e("AAA", s);
//            }
//
//            public void onError(@NonNull Throwable e) {}
//
//            @Override
//            public void onComplete() {}
//        });
//
//        publishSubject.onNext("Пять");
//        publishSubject.onNext("Шесть");
//        publishSubject.onNext("Семь");

        home1Button = (Button) findViewById(R.id.home1Button);
        home2Button = (Button) findViewById(R.id.home2Button);
        home3Button = (Button) findViewById(R.id.home3Button);
        home4Button = (Button) findViewById(R.id.home4Button);
        home5Button = (Button) findViewById(R.id.home5Button);
        home6Button = (Button) findViewById(R.id.home6Button);
        home9Button = (Button) findViewById(R.id.home9Button);
        home10Button = (Button) findViewById(R.id.home10Button);
        home14Button = (Button) findViewById(R.id.home14Button);
        lesson2Button = (Button) findViewById(R.id.lesson2Button);
        lesson3Button = (Button) findViewById(R.id.lesson3Button);
        lesson4Button = (Button) findViewById(R.id.lesson4Button);
        lesson5Button = (Button) findViewById(R.id.lesson5Button);
        lesson6Button = (Button) findViewById(R.id.lesson6Button);
        lesson7Button = (Button) findViewById(R.id.lesson7Button);
        lesson8Button = (Button) findViewById(R.id.lesson8Button);
        lesson12Button = (Button) findViewById(R.id.lesson12Button);
        lesson13Button = (Button) findViewById(R.id.lesson13Button);
        lesson14Button = (Button) findViewById(R.id.lesson14Button);
        lesson15Button = (Button) findViewById(R.id.lesson15Button);
        lesson16Button = (Button) findViewById(R.id.lesson16Button);

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
        home9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home9Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right,R.anim.left);
            }
        });
        home10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home10Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right,R.anim.left);
            }
        });
        home14Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home14Activity.class);
                startActivity(intent);
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
        lesson8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson8Activity.class);
                startActivity(intent);
            }
        });
        lesson12Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson12Activity.class);
                startActivity(intent);
            }
        });
        lesson13Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson13Activity.class);
                startActivity(intent);
            }
        });
        lesson14Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson14Activity.class);
                startActivity(intent);
            }
        });
        lesson15Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson15Activity.class);
                startActivity(intent);
            }
        });
        lesson16Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lesson16Activity.class);
                startActivity(intent);
            }
        });


    }


}
