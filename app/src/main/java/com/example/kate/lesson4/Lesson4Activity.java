package com.example.kate.lesson4;

import android.app.Activity;
import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.net.ConnectivityManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.kate.R;

public class Lesson4Activity extends Activity {

    private TextView textView;
    private int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);
        textView = (TextView) findViewById(R.id.textView);

        // startService(new Intent(this, MyService.class));

        Intent myintentService = new Intent(Lesson4Activity.this, MyIntentService.class);
        myintentService.putExtra(MyIntentService.KEY_ACTION,"Задание 1");
        startService(myintentService);

        Intent myintentService2 = new Intent(Lesson4Activity.this, MyIntentService.class);
        myintentService2.putExtra(MyIntentService.KEY_ACTION,"Задание 2");
        startService(myintentService2);

        Intent myintentService3 = new Intent(Lesson4Activity.this, MyIntentService.class);
        myintentService3.putExtra(MyIntentService.KEY_ACTION,"Задание 3");
        startService(myintentService3);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Intent intent = new Intent(Lesson4Activity.this, MyService.class);
//                stopService(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        intentFilter.addAction(MyIntentService.MY_ACTION);
        registerReceiver(broadcastReceiver, intentFilter);

        Intent intent = new Intent(Lesson4Activity.this, MyService.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);

        unbindService(serviceConnection);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.e("AAAA", "onServiceConnected");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e("AAAA", "onServiceDisconnected");
        }
    };




    private BroadcastReceiver broadcastReceiver  = new BroadcastReceiver(){
        @Override
        public void onReceive(Context context, Intent intent) {
            i++;
            textView.setText("i: " +i);

        }

    };

}
