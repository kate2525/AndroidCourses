package com.example.kate.lesson14;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.kate.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Lesson14Activity extends Activity {

    @BindView(R.id.editText2)
    EditText editText2;
    SharedPreferences sharedPreferences;
    private static String SAVE = "название файла";
    private static String KEY_NAME = "key";


    @BindView(R.id.buttonClick)
    Button buttonClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson14);

        //паттерн kniffe тоже самое что findbyid
       ButterKnife.bind(this);
        buttonClick.setText("click here");

        //файл называется SAVE
        sharedPreferences = getSharedPreferences(SAVE, Context.MODE_PRIVATE);

        //сохранение данных по клику на кнопку
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //сохранение в документ по принципу hoshmap
                sharedPreferences.edit().putString(KEY_NAME, String.valueOf(editText2.getText()))
                                       .apply();
            }
        });

        //если в edit текст есть информация,то она уже будет сохранена в edit текст,даже если вы вышли из приложения
        //и снова зашли,а текст будет в поле
        String data = sharedPreferences.getString(KEY_NAME, null);
        if (data != null)
            editText2.setText(data);
    }
}
