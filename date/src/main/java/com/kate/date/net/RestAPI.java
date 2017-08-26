package com.kate.date.net;


import com.kate.date.entity.Profile;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestAPI {


    //сохраняем данные
    @POST("data/profile")
    Observable<Void> saveProfile (@Body Profile profile);

    @GET("data/profile")
    Observable<List<Profile>> getProfile();


}
