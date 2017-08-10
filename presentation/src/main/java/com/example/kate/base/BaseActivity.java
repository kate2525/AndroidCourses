package com.example.kate.base;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kate.R;

abstract public class BaseActivity extends Activity {

    protected BaceViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel.init();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.release();
    }
}
