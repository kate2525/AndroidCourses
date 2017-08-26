package com.example.kate.home9;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;


import com.example.kate.R;
import com.example.kate.base.BaseActivity;
import com.example.kate.databinding.ActivityHome9Binding;

public class Home9Activity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Home9ViewModel viewModel = new Home9ViewModel();
        this.viewModel = viewModel;
        ActivityHome9Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_home9);
        binding.setViewModel(viewModel);

        binding.RecyclerView.setAdapter(viewModel.adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.RecyclerView.setLayoutManager(layoutManager);

        super.onCreate(savedInstanceState);

    }
}
