package com.example.kate.lessson12;


import android.app.Activity;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;

import com.example.kate.base.BaceViewModel;
import com.kate.domain.Entity.ProfileId;
import com.kate.domain.Entity.ProfileModel;
import com.kate.domain.Interctions.GetProfileListUseCase;
import com.kate.domain.Interctions.ProfileUseCase;
import com.kate.domain.Interctions.SaveProfileUseCase;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

public class Lesson12ViewModel implements BaceViewModel {

    public enum STATE {PROGRESS, DATA}

    public ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);
    private Activity activity;
    private GetProfileListUseCase getProfileListUseCase = new GetProfileListUseCase();

    public Lesson12ViewModel(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void init() {

    }

    @Override
    public void resume() {
        getProfileListUseCase.execute(null, new DisposableObserver<List<? extends ProfileModel>>(){

            @Override
            public void onNext(List<? extends ProfileModel> profileModels) {

                Log.e("AAAA item " + profileModels.size(),"");

            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        });

    }

    @Override
    public void pause() {

    }

    @Override
    public void release() {

    }
}
