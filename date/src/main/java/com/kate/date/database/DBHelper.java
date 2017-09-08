package com.kate.date.database;


import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

 class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "test";
    private static final int VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    //метод создания бд
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("DB_create", "onCreate");
        //создаем таблицы
        db.execSQL("CREATE TABLE user "+
                "('id' INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "'name' TEXT,"+
                "'age' INTEGER,"+
                "'countryPoUser' INTEGER)");

        db.execSQL("CREATE TABLE country "+
                "('id' INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "'name' TEXT)");
        //транзакции используют чтобы вернуться в начальное состояние,если произошла ошибка
//        db.beginTransaction();
//        db.endTransaction();
    }

    //метод для обновления данных в бд
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("DB_create", "onUpgrade");
    }
}
