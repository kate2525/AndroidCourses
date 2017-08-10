package com.example.kate.home5;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.kate.R;

public class Home5Activity extends Activity {
    private TextView textMessage;


    private BroadcastReceiver receiverGet = new BroadcastReceiver() {

        //сюда приходит сообщение
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d("MyBroadcastReceiver", " ПРИШЛО УВЕДОМЛЕНИЕ!!!");

            String value = intent.getStringExtra("state");

            Log.d("value", "value "+value);



            textMessage.setText(value);



        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home5);
        textMessage = (TextView)findViewById(R.id.textMessage);


    }

    @Override
    protected void onStart() {
        super.onStart();
         Intent intent = new Intent(this, MyServiceHome.class);
         startService(intent);

        IntentFilter intentFilter = new IntentFilter();
        //получаем уведомления о получении com.example.kate.home5.MyBroadcastReceiverHome
        intentFilter.addAction("com.example.kate.home5.MyBroadcastReceiverHome");
        //receiverGet -  куда отправляется сообщение. А intentFilter- какое именно сообщение пришло
        registerReceiver(receiverGet, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
          Intent intent = new Intent(this, MyServiceHome.class);
          stopService(intent);
        unregisterReceiver(receiverGet);
    }

}
