package com.kate.domain.Interctions;

import com.kate.domain.Entity.ResycleURL;
import com.kate.domain.Interctions.base.UseCase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;



public class ResycleViewUseCase extends UseCase<Void, List<ResycleURL>> {
    @Override
    protected Observable<List<ResycleURL>> buildUseCase(Void param) {

        ResycleURL resycleURL = new ResycleURL();
        resycleURL.setName("Mаша");
        resycleURL.setAge(20);
        resycleURL.setUrl("http://cs3.pikabu.ru/post_img/2014/04/03/10/1396542129_252938718.jpg");

        ResycleURL resycleURL2 = new ResycleURL();
        resycleURL2.setName("Тимофей");
        resycleURL2.setAge(27);
        resycleURL2.setUrl("http://cs3.pikabu.ru/post_img/2014/04/03/10/1396542129_252938718.jpg");

        ResycleURL resycleURL3 = new ResycleURL();
        resycleURL3.setName("Катя");
        resycleURL3.setAge(25);
        resycleURL3.setUrl("http://cs3.pikabu.ru/post_img/2014/04/03/10/1396542129_252938718.jpg");

        List<ResycleURL> list = new ArrayList<>();
        list.add(resycleURL);
        list.add(resycleURL2);
        list.add(resycleURL3);

        return Observable.just(list);
    }
}
