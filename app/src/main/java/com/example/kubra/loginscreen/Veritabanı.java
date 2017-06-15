package com.example.kubra.loginscreen;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kubra on 13.06.2017.
 */

public class Veritabanı extends SQLiteOpenHelper {
    final  public  String DataBase_Name="user";
            final public  int DataBase_VERSION=1;

    public Veritabanı(Context context){
        super(context, DataBase_Name, null, DataBase_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
