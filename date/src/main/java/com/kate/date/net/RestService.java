package com.kate.date.net;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kate.date.entity.Profile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestService {

    private static final RestService instance = new RestService();
    private  RestAPI restAPI;

    private RestService(){
        init();
    }

    public  static RestService getInstance(){
        return  instance;
    }

    public  void init(){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();

        Gson gson = new GsonBuilder().create();

        //elecrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.backendless.com/70E26EEB-3ACD-601D-FF12-541F239F8800/FDBEBFDC-2C3B-E045-FF00-D718E4134700/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                //конвертировать данные
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient).build();

        //готовую реализацию парсинга возвратит в интерфейс
        restAPI = retrofit.create(RestAPI.class);
    }

    public Observable<List<Profile>> getProfile(){
        return  restAPI.getProfile();
    }

    public Observable <Void> saveProfile(Profile profile){
        return  restAPI.saveProfile(profile);
    }
}
