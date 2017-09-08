package com.example.kate.lesson15;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kate.R;
import com.example.kate.base.BaseActivity;
import com.example.kate.databinding.ActivityLesson15Binding;

public class Lesson15Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Lesson15ViewModel viewModel = new Lesson15ViewModel(this);
        this.viewModel = viewModel;
        ActivityLesson15Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_lesson15);
        binding.setViewModel(viewModel);


        super.onCreate(savedInstanceState);

    }
}
