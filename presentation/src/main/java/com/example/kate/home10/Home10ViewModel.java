package com.example.kate.home10;


import android.util.Log;

import com.example.kate.base.BaceViewModel;
import com.example.kate.home9.MyResycleViewAdapter;
import com.kate.domain.Entity.UserDomain;
import com.kate.domain.Interctions.ResycleRESTUseCase;
import com.kate.domain.Interctions.ResycleViewUseCase;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;

public class Home10ViewModel implements BaceViewModel {

    public enum STATE {PROGRESS, DATA}

    //public ObservableField<Home9ViewModel.STATE> state = new ObservableField<>(Home9ViewModel.STATE.PROGRESS);
    private ResycleRESTUseCase resycle= new ResycleRESTUseCase();
    public MyResycleViewAdapterHome10 adapter = new MyResycleViewAdapterHome10();


    @Override
    public void init() {
       adapter.setListener(new MyResycleViewAdapterHome10.OnItemClickListener() {
           @Override
           public void onItemClick(UserDomain item) {
               Log.d("AAAAAAAAA", "print");
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
