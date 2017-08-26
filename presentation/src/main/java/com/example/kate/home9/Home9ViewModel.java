package com.example.kate.home9;


import android.databinding.ObservableField;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kate.base.BaceViewModel;
import com.kate.domain.Entity.ResycleURL;
import com.kate.domain.Interctions.ProfileUseCase;
import com.kate.domain.Interctions.ResycleViewUseCase;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;




public class Home9ViewModel implements BaceViewModel {

    public  enum  STATE {PROGRESS, DATA}
    //public ObservableField<Home9ViewModel.STATE> state = new ObservableField<>(Home9ViewModel.STATE.PROGRESS);
    private ResycleViewUseCase resycleViewUseCase = new ResycleViewUseCase();
    public MyResycleViewAdapter adapter = new MyResycleViewAdapter();



    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {
        resycleViewUseCase.execute(null, new DisposableObserver<List<ResycleURL>>() {

            @Override
            public void onNext(@NonNull List<ResycleURL> resycleURLs) {
                Log.d("AAAAAA", "resycleURLs "+resycleURLs.toString());
                //отправляем данные из domain в класс Adapter
                adapter.setResycleURLs(resycleURLs);
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
