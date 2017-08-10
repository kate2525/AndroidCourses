package com.example.kate.lesson7;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.kate.R;
import com.example.kate.base.BaseActivity;
import com.example.kate.databinding.ActivityLesson7Binding;
import com.example.kate.lesson6.Lesson6Activity;

public class Lesson7Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        Lesson7ViewModel viewModel = new Lesson7ViewModel(this);
        this.viewModel = viewModel;
        ActivityLesson7Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_lesson7);
        binding.setViewModel(viewModel);

        super.onCreate(savedInstanceState);
    }

    public static void show(Activity activity){
        Intent intent = new Intent(activity, Lesson6Activity.class);
        activity.startActivity(intent);
    }
}
