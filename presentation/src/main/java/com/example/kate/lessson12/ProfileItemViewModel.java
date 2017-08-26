package com.example.kate.lessson12;

import android.databinding.ObservableField;

import com.example.kate.base.BaseItemViewModel;
import com.kate.domain.Entity.ProfileModel;



public class ProfileItemViewModel extends BaseItemViewModel<ProfileModel> {

    ObservableField <String> name = new ObservableField<>("");
    @Override
    protected void setItem(ProfileModel item, int position) {
        name.set(item.getName());
    }
}
