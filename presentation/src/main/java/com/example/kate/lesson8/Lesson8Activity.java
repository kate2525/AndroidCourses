package com.example.kate.lesson8;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.kate.R;
import com.example.kate.base.BaseActivity;
import com.example.kate.databinding.ActivityLesson8Binding;


public class Lesson8Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Lesson8ViewModel viewModel = new Lesson8ViewModel();
        this.viewModel = viewModel;
        ActivityLesson8Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_lesson8);
        binding.setViewModel(viewModel);

        super.onCreate(savedInstanceState);
    }
}



