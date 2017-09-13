package com.example.kate.di;

import com.example.kate.home10.Home10ViewModel;
import com.example.kate.lesson17.Gson;
import com.example.kate.lesson17.OKhttp;
import com.example.kate.lesson17.Rest;
import com.example.kate.lesson17.SharedPreference;
import com.example.kate.lesson17.UseCase1;
import com.kate.domain.Interctions.ResycleRESTUseCase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * модуль нужен для того чтобы сказать как создать объект.т.е usecase1,usecase2 ...
 */
@Module
public class AppModule {

    @Provides
    public ResycleRESTUseCase testHomeViewModel(){
        return new ResycleRESTUseCase();
    }

    @Provides
    public UseCase1 testUseCase1(Rest rest, SharedPreference sharedPreference){
        return new UseCase1(rest, sharedPreference);
    }
    @Provides
    public Rest testRest(OKhttp oKhttp, Gson gson){
        return new Rest(oKhttp, gson);
    }

    @Provides
    public SharedPreference testSharedPref(){
        return new SharedPreference();
    }

    @Provides
    public OKhttp testOkHttp(){
        return new OKhttp();
    }

    @Provides
    public Gson testGson(){
        return new Gson();
    }

}
