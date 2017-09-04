package com.kate.domain.Interctions;

import com.kate.date.entity.Profile;
import com.kate.date.entity.UserDate;
import com.kate.date.net.RestService;
import com.kate.domain.Entity.ProfileId;
import com.kate.domain.Entity.ProfileModel;
import com.kate.domain.Entity.UserDomain;
import com.kate.domain.Interctions.base.UseCase;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;


public class ResycleRESTUseCase extends UseCase<Void, List<UserDomain>> {

    @Override
    protected Observable<List<UserDomain>> buildUseCase(Void param) {

        return RestService.getInstance().getUsers()
                //модифицирует данные из одного формата в другой формат.из userDate в userDomain
                .map(new Function<List<UserDate>, List<UserDomain>>() {
                    @Override
                    public List<UserDomain> apply(@NonNull List<UserDate> userDates) throws Exception {


                        List<UserDomain> userDomain = new ArrayList<>();
                        for (int i = 0; i < userDates.size(); i++) {

                            UserDomain user = new UserDomain();
                            user.setName(userDates.get(i).getName());
                            user.setSurname(userDates.get(i).getSurname());
                            user.setAge(userDates.get(i).getAge());
                            userDomain.add(user);
                        }
                        return userDomain;
                    }
                });

    }
}
