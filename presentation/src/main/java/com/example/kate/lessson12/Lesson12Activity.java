package com.example.kate.lessson12;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.kate.R;
import com.example.kate.lesson8.Lesson8Activity;

public class Lesson12Activity extends Activity {


    public static void show(Activity activity){
        Intent intent = new Intent(activity, Lesson8Activity.class);
        activity.startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {



//        Lesson12ViewModel viewModel = new Lesson12ViewModel(this);
//        this.viewModel = viewModel;
//        ActivityLesson12Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_lesson8);
//        binding.setViewModel(viewModel);
//        binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        binding.RecyclerView.setLayoutManager();
        super.onCreate(savedInstanceState);

    }
}
