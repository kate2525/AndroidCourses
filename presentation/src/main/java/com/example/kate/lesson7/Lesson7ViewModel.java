package com.example.kate.lesson7;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableField;
import android.os.AsyncTask;
import android.util.Log;

import com.example.kate.base.BaceViewModel;
import com.example.kate.lesson6.Lesson6Activity;

public class Lesson7ViewModel implements BaceViewModel {

    public Activity activity;

    public ObservableField<String> helloText = new ObservableField<>("Hello");

    public Lesson7ViewModel(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }
    public void clickButton(){
        Log.d("AAAAAAAAAA", "click");
        Lesson7Activity.show(activity);

    }

    //Проблема из класса вызывать отдельно другой интрефейс
    //потоки
    public class MyAsyncTask extends AsyncTask<Void, Integer, String>{

        //выполняется в ui потоке, до начала метода doInBackground. выполняется первым.
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        //выполняется в ui потоке.
        //этот метод необходимо вызывать самостоятельно из doInBackground
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }


        //все выполняется в отдельном потоке, затем передает в метод onPostExecute
        @Override
        protected String doInBackground(Void... params) {

            publishProgress(20);//вызываем метод onProgressUpdate
            return "";
        }

        //выполнится в ui потоке.Входные данные из return метода doInBackground передадутся во входные данные s
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }

}
