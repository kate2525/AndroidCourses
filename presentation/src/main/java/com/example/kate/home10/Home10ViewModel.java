package com.example.kate.home10;


import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import com.example.kate.base.BaceViewModel;
import com.example.kate.main.ExampleApplication;
import com.kate.domain.Entity.UserDomain;
import com.kate.domain.Interctions.ResycleRESTUseCase;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

public class Home10ViewModel implements BaceViewModel {

    public enum STATE {PROGRESS, DATA}

    //public ObservableField<Home9ViewModel.STATE> state = new ObservableField<>(Home9ViewModel.STATE.PROGRESS);
      @Inject
      public ResycleRESTUseCase resycle;
   // private ResycleRESTUseCase resycle= new ResycleRESTUseCase();
    public MyResycleViewAdapterHome10 adapter = new MyResycleViewAdapterHome10();
    private Activity activity;

    public Home10ViewModel(Activity activity) {
        ExampleApplication.appComponent.inject(this);
        this.activity = activity;
    }

    @Override
    public void init() {
       adapter.setListener(new MyResycleViewAdapterHome10.OnItemClickListener() {
           @Override
           public void onItemClick(UserDomain item) {
               EachIdActivity.show(activity, item.getName(), item.getSurname(), item.getAge());

//               Intent intent = getIntent();
//               String fName = intent.getStringExtra("fname");
//               String lName = intent.getStringExtra("lname");
//
//               tvView.setText("Your name is: " + fName + " " + lName);


           }
       });
    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

        resycle.execute(null, new DisposableObserver<List<UserDomain>>() {
            @Override
            public void onNext(@NonNull List<UserDomain> userDomains) {
                adapter.setResycleRests(userDomains);
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
    public void pause() {

    }
}
