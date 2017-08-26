package com.kate.domain.Interctions;



import com.kate.date.entity.Profile;
import com.kate.date.net.RestService;
import com.kate.domain.Entity.ProfileId;
import com.kate.domain.Entity.ProfileModel;
import com.kate.domain.Interctions.base.UseCase;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

public class SaveProfileUseCase extends UseCase <ProfileModel, Void>{


    @Override
    protected Observable<Void> buildUseCase(ProfileModel param) {
        Profile profileData = new Profile();

        profileData.setName(profileData.getName());
        profileData.setAge(profileData.getAge());

        return RestService.getInstance().saveProfile(profileData);
    }
}
