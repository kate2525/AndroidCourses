package com.example.kate.home3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kate.BuildConfig;
import com.example.kate.R;
import com.squareup.picasso.Picasso;

public class Home3Activity extends AppCompatActivity {
    private Button button;
    private TextView textGradle;
    private ImageView imageDowload;
    private ImageView imageGride;
    private String url = "http://bm.img.com.ua/nxs/img/prikol/images/large/0/0/307600.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);

        textGradle = (TextView) findViewById(R.id.textGradle);
        button = (Button) findViewById(R.id.button);
        imageDowload = (ImageView)findViewById(R.id.imageDowload);
        imageGride = (ImageView)findViewById(R.id.imageGride);
        final String token = BuildConfig.API_ENDPOINT;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.with(Home3Activity.this).load(url).resize(200, 200).into(imageDowload);
                textGradle.setText(token);
                //glide picture
                Glide.with(Home3Activity.this).load(url).apply(RequestOptions.circleCropTransform()).into(imageGride);
            }
        });
    }
}
