package com.example.kate.home6;


import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ImageBild {

    @BindingAdapter({"bind:src"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).apply(RequestOptions.circleCropTransform()).into(imageView);
    }
}
