package com.example.kate.main;


import android.app.Application;

import com.example.kate.di.AppComponent;
import com.example.kate.di.AppModule;
import com.example.kate.di.DaggerAppComponent;
import com.squareup.leakcanary.LeakCanary;

import io.realm.Realm;

public class ExampleApplication extends Application {

    public static AppComponent appComponent;


    @Override public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        Realm.init(this);

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }
}
