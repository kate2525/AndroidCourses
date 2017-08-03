package com.example.kate.lesson4;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;


public class MyIntentService extends IntentService {
    public static final String KEY_ACTION ="KEY_ACTION";

    public static final String MY_ACTION ="lesson4.MY_ACTION";


    public MyIntentService() {
        super("jhgjhgkj");
    }

    //в очереди стоят задачи
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        String action = intent.getStringExtra(KEY_ACTION);
        //  Log.e("AAA","onHandleIntent" + action);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //посылаем сообщение.Глобальный брудкастресивер
        Intent intentReciver = new Intent(MY_ACTION);
        sendBroadcast(intentReciver);

        //локальный брудкастресивер
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        localBroadcastManager.sendBroadcast(intentReciver);
    }
}
