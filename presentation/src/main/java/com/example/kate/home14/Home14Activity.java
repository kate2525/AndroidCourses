package com.example.kate.home14;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kate.R;

import java.util.List;

public class Home14Activity extends Activity {
    private Spinner spinner;
    private static String SAVE = "название файла";
    private static String CODE = "код страны";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home14);

        List<Countries> countriesList = ParseJson.jsonParse(this);
        final CountryAdapter adapter = new CountryAdapter(this, countriesList);

        //файл называется SAVE
        sharedPreferences = getSharedPreferences(SAVE, Context.MODE_PRIVATE);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        String code = sharedPreferences.getString(CODE, null);
        if(code != null) {
            Log.d("AAAAA","code " + code);
            int index = 0;
            for (int i = 0; i<countriesList.size(); i++) {
                if (code.equals(countriesList.get(i).getCode())) {
                    index = i;
                    break;
                }
            }
            Log.d("AAAAA","index"+index);
            spinner.setSelection(index, false);
        }

        //устанавливаем обработчик нажатия
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             // показываем позиция нажатого элемента
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
                Countries countries  = adapter.getItemModel(position);
                sharedPreferences.edit().putString(CODE,countries.getCode())
                                         .apply();
                Toast.makeText(getBaseContext(), "code = " + countries.getCode(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
}

