package com.example.kate.lesson15;


import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;

import com.example.kate.base.BaceViewModel;
import com.kate.domain.Entity.AddUser;
import com.kate.domain.Entity.User;
import com.kate.domain.Interctions.AddUserToDBUseCase;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

public class Lesson15ViewModel implements BaceViewModel{

    private AddUserToDBUseCase addToDBUseCase = new AddUserToDBUseCase();
    private Context context;

    public ObservableInt userId = new ObservableInt(0);
    public ObservableField <String> userName = new ObservableField<>("");
    public ObservableInt userAge = new ObservableInt(0);


    public Lesson15ViewModel(Context context) {
        this.context = context;
    }

    @Override
    public void init() {

    }

    public  void addUsers(){

        Log.e("AAA", "addUsers()");

        final User user = new User();
        user.setAge(userAge.get());
        user.setName(userName.get());
        // userName.set("Tany");
        // userAge.set(15);

        AddUser addUser = new AddUser(context, user);
        addToDBUseCase.execute(addUser, new DisposableObserver<String>() {
            @Override
            public void onNext(@NonNull String aVoid) {
                Log.e("AAA", "Saved");
            }

            @Override
            public void onError(@NonNull Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        });
    }

    @Override
    public void resume() {
//         userName.set("Tany");
//         userAge.set(15);
    }

    @Override
    public void release() {

    }

    @Override
    public void pause() {

    }
}
