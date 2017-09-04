package com.kate.domain.Interctions;



import com.kate.date.entity.Profile;
import com.kate.date.net.RestService;
import com.kate.domain.Entity.ProfileId;
import com.kate.domain.Entity.ProfileModel;
import com.kate.domain.Interctions.base.UseCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

public class ProfileUseCase extends UseCase <ProfileId, ProfileModel>{

    //запрос к REST
    @Override
    protected Observable <ProfileModel> buildUseCase(ProfileId param) {

//        Profile profile = new Profile();
//        profile.setName("Name");
//        profile.setAge(20);
//        //создадим Observable и делаем задержку в 3 сек методом .delay(3, TimeUnit.SECONDS)
//        //Observable - источник данных
//        return Observable.just(profile)
        return RestService.getInstance().getProfileById(param.getId())
               // .delay(3, TimeUnit.SECONDS)
                //модифицирует данные из одного формата в другой формат.На входе Profile,а на выходе ProfileModel
                .map(new Function<Profile, ProfileModel>() {
                    @Override
                    public ProfileModel apply(@NonNull Profile profileData ) throws Exception {

                        ProfileModel profileModel = new ProfileModel();
                        profileModel.setName(profileData.getName());
                        profileModel.setAge(profileData.getAge());
                        return profileModel;
                    }
                });




    }
}
