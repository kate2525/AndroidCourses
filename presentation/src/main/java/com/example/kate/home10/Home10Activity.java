package com.example.kate.home10;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import com.example.kate.R;
import com.example.kate.base.BaseActivity;
import com.example.kate.databinding.ActivityHome10Binding;


public class Home10Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Home10ViewModel viewModel = new Home10ViewModel(this);
        this.viewModel = viewModel;
        ActivityHome10Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_home10);
        binding.setViewModel(viewModel);

        binding.RecyclerView.setAdapter(viewModel.adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.RecyclerView.setLayoutManager(layoutManager);


        super.onCreate(savedInstanceState);

    }
}

