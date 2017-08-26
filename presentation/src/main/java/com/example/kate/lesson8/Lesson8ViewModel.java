package com.example.kate.lesson8;


import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;

import com.example.kate.base.BaceViewModel;
import com.kate.domain.Entity.ProfileModel;
import com.kate.domain.Entity.ProfileId;
import com.kate.domain.Interctions.ProfileUseCase;
import com.kate.domain.Interctions.SaveProfileUseCase;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

public class Lesson8ViewModel implements BaceViewModel {

    public  enum  STATE {PROGRESS, DATA}

    public ObservableField<String> name = new ObservableField<>("");
    public ObservableInt age = new ObservableInt(0);
    public  ObservableField<STATE> state = new ObservableField<>(STATE.PROGRESS);
    private ProfileUseCase useCase = new ProfileUseCase();
    private SaveProfileUseCase saveProfileUseCase = new SaveProfileUseCase();

    @Override
    public void init() {

    }

    @Override
    public void resume() {

        ProfileModel profileModel = new ProfileModel();
        profileModel.setAge(27);
        profileModel.setName("New name");
        saveProfileUseCase.execute(profileModel, new DisposableObserver<Void>() {
            @Override
            public void onNext(@NonNull Void aVoid) {
                Log.d("AAAAAA", "OK");
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d("AAAAAA", "error");
            }

            @Override
            public void onComplete() {

            }
        });




        ProfileId profileId = new ProfileId();
        profileId.setId("123");
            useCase.execute(profileId, new DisposableObserver<ProfileModel>() {

                //получаем данные
                @Override
                public void onNext(@NonNull ProfileModel profile) {
                    name.set(profile.getName());
                    Log.d("AAAAAAAA", "getName");
                    age.set(profile.getAge());
                    Log.d("AAAAAAAA", "getAge");
                    state.set(STATE.DATA);
                }

                //cообщает об ошибках
                @Override
                public void onError(@NonNull Throwable e) {
                    Log.e("AAAAAA", "error " +e);
                }
                //cообщает о завершении
                @Override
                public void onComplete() {

                }
            });



    }

    @Override
    public void pause() {
        useCase.dispose();
        saveProfileUseCase.dispose();
    }

    @Override
    public void release() {

    }
}
