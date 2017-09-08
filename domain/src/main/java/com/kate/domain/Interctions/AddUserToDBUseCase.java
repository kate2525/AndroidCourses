package com.kate.domain.Interctions;

import com.kate.date.database.DatabaseManager;
import com.kate.domain.Entity.AddUser;
import com.kate.domain.Entity.Country;
import com.kate.domain.Entity.User;
import com.kate.domain.Interctions.base.UseCase;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;


public class AddUserToDBUseCase extends UseCase<AddUser,String>{

    @Override
    protected Observable<String> buildUseCase(final AddUser param) {

        DatabaseManager databaseManager = new DatabaseManager(param.getContext());
        databaseManager.open(true);
        databaseManager.insertUser(convert(param.getUser()));
        databaseManager.close();

        return Observable.just("");
    }

    //из date получаем данные в domain
    private com.kate.date.databaseEntity.User convert(User user) {
        com.kate.date.databaseEntity.User userData = new com.kate.date.databaseEntity.User();
        userData.setName(user.getName());
        userData.setAge(user.getAge());
//        userData.setCountryPoUser(convertCountry(user.getCountryPoUser()));
        return userData;
    }

    private com.kate.date.databaseEntity.Country convertCountry(Country country) {
        com.kate.date.databaseEntity.Country countryData = new com.kate.date.databaseEntity.Country();
        countryData.setName(country.getName());
        countryData.setId(country.getId());
        return countryData;
    }
}


