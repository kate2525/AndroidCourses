package com.example.kate.home5;


import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.example.kate.R;

public class MyServiceHome extends Service {

    private BroadcastReceiver myBroadcastSend = new BroadcastReceiver(){

        @Override
        public void onReceive(Context context, Intent intent) {

            String state = null;

            WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
            if (wifiManager != null && wifiManager.isWifiEnabled())
            {
                state = "On";
            } else  {
                state = "Off";
            }

            Log.d("LOG","LOG +state" +state);

            if(state != null) {
                //my message for broadcastReciverGet
                Intent myIntent = new Intent();
                myIntent.setAction("com.example.kate.home5.MyBroadcastReceiverHome");
                myIntent.putExtra("state", state);
                sendBroadcast(myIntent);
            }

        }
    };

    @Override
    public void onCreate() {
        super.onCreate();

        IntentFilter intentFilter = new IntentFilter();
        //получаем уведомления о влючении/выключении wifi
        intentFilter.addAction(WifiManager.SUPPLICANT_CONNECTION_CHANGE_ACTION);
        //myBroadcast -  куда отправляется сообщение. А intentFilter- какое именно сообщение пришло
        registerReceiver(myBroadcastSend, intentFilter);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myBroadcastSend);
    }
}
