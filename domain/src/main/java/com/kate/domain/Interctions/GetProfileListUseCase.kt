package com.kate.domain.Interctions


import com.kate.date.entity.Profile
import com.kate.date.net.RestService
import com.kate.domain.Entity.ProfileModel
import com.kate.domain.Interctions.base.UseCase

import io.reactivex.Observable

class GetProfileListUseCase : UseCase<Void, List<ProfileModel>>() {

    override fun buildUseCase(param: Void?): Observable<List<ProfileModel>> {

        return RestService.getInstance().profile.map {
            it.map { convert(it) }
        }
    }

    private fun convert(dataModel: Profile): ProfileModel {
        val profileModel = ProfileModel();
        profileModel.name = dataModel.name
        profileModel.age = dataModel.age
        return profileModel
    }
}

