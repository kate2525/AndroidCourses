package com.kate.date.database;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.kate.date.databaseEntity.Country;
import com.kate.date.databaseEntity.User;

import java.util.List;

public class DatabaseManager {

    private Context context;
    private DBHelper dbHelper;
    private SQLiteDatabase database;

    public DatabaseManager(Context context) {
        this.context = context;
        dbHelper = new DBHelper(context);
    }

    public void open(boolean isWritable) {
        if (isWritable) {
            database = dbHelper.getWritableDatabase();
        } else {
            database = dbHelper.getWritableDatabase();
        }
    }

    public void close() {
        if (database != null) {
            database.close();
        }
    }

    //добавление данных
    public void insertUser(User user) {

        StringBuilder sql = new StringBuilder();
       // sql.append("INSERT INTO user ('name', 'age', 'countryPoUser')");
        sql.append("INSERT INTO user ('name', 'age')");
        sql.append("VALUES (");
        sql.append("'");
        sql.append(user.getName());
        sql.append("', ");
        sql.append(user.getAge());
 //       sql.append(", ");
//        sql.append(user.getCountryPoUser().getId());
        sql.append(")");

        Log.e("AAAaaa", "insert"+ sql.toString());
        database.execSQL(sql.toString());
    }

    public void update(User use) {

    }

    public List<User> getUsers() {
        return null;
    }

    //получить по id
    public User getUserById(int id) {
        // cursor типо колекции
        Cursor cursor = database.rawQuery("SELECT * FROM user INNER JOIN country ON"+
                "user.countryPoUser = country.id WHERE id =? ",
                new String[]{String.valueOf(id)});
        //вариант 2
//        Cursor cursor =  database.rawQuery("SELECT * FROM user WHERE id = " + id, null);

        if (cursor != null) {

            User user = new User();
            //перекинуть курсор на начало
            cursor.moveToFirst();
            int userId = cursor.getInt(0);
            String name = cursor.getString(1);
            int age = cursor.getInt(2);
            int countryPoUser = cursor.getInt(3);
            String countryName = cursor.getString(4);

            user.setId(userId);
            user.setName(name);
            user.setAge(age);

            Country country = new Country();
            country.setId(countryPoUser);
            country.setName(countryName);

            //Добавляем объект country в user
            user.setCountryPoUser(country);

            return user;
        } else {
            Log.d("AAAaaa", "cursor = 0");
        }
        return null;
    }
}
