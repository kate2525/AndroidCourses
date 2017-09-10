package com.example.kate.lesson16;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.kate.R;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmModel;

public class Lesson16Activity extends FragmentActivity {

    private Realm realm;
    private EditText editText2;
    private Button buttonClick;
    private UserDB user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson16);
        //////

        /////
        editText2 = (EditText) findViewById(R.id.editText2);
        buttonClick = (Button) findViewById(R.id.buttonClick);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        realm = Realm.getDefaultInstance();
        loadData();
    }

    @Override
    protected void onPause() {
        super.onPause();
        realm.close();
    }

    private void saveData(){

        if (user == null){
            user = new UserDB();
           // user = realm.createObject(UserDB.class);
            realm.beginTransaction();
            user.setId(11);
            user = realm.copyToRealmOrUpdate(user);
            realm.commitTransaction();
        }
        //сохранить юзера в базу данных
        realm.beginTransaction();
        user.setName(String.valueOf(editText2.getText()));
        realm.commitTransaction();
    }

    private void loadData(){
        //загрузка
        user = realm.where(UserDB.class)
                .equalTo("id", 11)
                .findFirst();

        if (user != null){
            editText2.setText(user.getName());
        }

        //когда объект поменялся
//        user.addChangeListener(new RealmChangeListener<RealmModel>() {
//            @Override
//            public void onChange(RealmModel realmModel) {
//                editText2.setText(user.getName());
//            }
//        });

    }
}
