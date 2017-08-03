package com.example.kate.lesson4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("AAA", "Service_OnCreate");


    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("AAA", "Service_onBind");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("AAA", "Service_onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("AAA", "Service_onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.e("AAA", "Service_onDestroy");
        super.onDestroy();
    }
}
