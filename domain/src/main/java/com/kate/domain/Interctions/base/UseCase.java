package com.kate.domain.Interctions.base;


import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public abstract class UseCase<InParam, OutParam> {

    private Disposable disposable;


    protected abstract Observable<OutParam> buildUseCase(InParam param);

    //выполнняет buildUseCase
    //DisposableObserver - подпищик.
    //DisposableObserver<OutParam> disposableObserver - типо setOnClickListener
    //buildUseCase - типо кнопка
    public void execute(InParam param, DisposableObserver<OutParam> disposableObserver){
        disposable = buildUseCase(param)
                //получить ответ в UI потоке. Получение должно быть в том пом потоке в котором они записаны
                .observeOn(AndroidSchedulers.mainThread())
                //выполнение в другом потоке
                .subscribeOn(Schedulers.newThread())
                //подписка на получение данных.
                .subscribeWith(disposableObserver);
    }

    //отписка
    public void dispose(){
        if(!disposable.isDisposed()){
            disposable.dispose();
        }
    }

}
