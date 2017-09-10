package com.example.kate.main;


import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import io.realm.Realm;

public class ExampleApplication extends Application {



    @Override public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        Realm.init(this);
        // Normal app init code...
    }
}
