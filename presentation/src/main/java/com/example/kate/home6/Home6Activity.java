package com.example.kate.home6;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kate.R;
import com.example.kate.databinding.ActivityHome6Binding;


public class Home6Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityHome6Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_home6);
       User user = new User();
        binding.setUser(user);





    }
}
