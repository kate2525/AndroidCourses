package com.example.kate.lessson12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.kate.base.BaseAdapter;
import com.example.kate.base.BaseItemViewHolder;
import com.kate.domain.Entity.ProfileModel;

public class ProfileAdapter extends BaseAdapter<ProfileModel, ProfileItemViewModel> {

    private Context context;

    public ProfileAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BaseItemViewHolder<ProfileModel, ProfileItemViewModel, ?>
    onCreateViewHolder(ViewGroup parent, int viewType) {
        ProfileItemViewModel itemViewModel = new ProfileItemViewModel();
//        return ProfileItemViewHolder.create(LayoutInflater.from(context),
//                parent, itemViewModel);
        return  null;
    }
}
