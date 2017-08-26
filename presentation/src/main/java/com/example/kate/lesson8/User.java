//package com.example.kate.lesson8;
//
//
//import android.databinding.ObservableField;
//import android.databinding.ObservableInt;
//import android.graphics.Color;
//import android.util.Log;
//
//import com.example.kate.base.*;
//import com.kate.domain.Entity.Profile;
//import com.kate.domain.Entity.ProfileId;
//import com.kate.domain.Interctions.ProfileUseCase;
//
//public class User implements BaceViewModel{
//
//    public  enum  STATE {PROGRESS, DATA}
//
//    public ObservableField<String> name = new ObservableField<>("");
//    public ObservableInt age = new ObservableInt(0);
//    public  ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);
//    private ProfileUseCase useCase = new ProfileUseCase();
//
//    @Override
//    public void init() {
//
//    }
//
//    @Override
//    public void resume() {
//        ProfileId profileId = new ProfileId();
//        profileId.setId("123");
//        Profile profile = useCase.execute(profileId);
//
//        name.set(profile.getName());
//        Log.d("AAAAAAAA","getName");
//        age.set(profile.getAge());
//        Log.d("AAAAAAAA","getAge");
//
//        state.set(STATE.DATA);
//    }
//
//    @Override
//    public void release() {
//
//    }
//
//    @Override
//    public void pause() {
//
//    }
//
//}
