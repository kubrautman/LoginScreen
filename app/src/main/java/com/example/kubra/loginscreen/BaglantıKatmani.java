package com.example.kubra.loginscreen;
import android.content.Context;
import  android.database.sqlite.SQLiteDatabase;
import  android.content.Context;


/**
 * Created by kubra on 13.06.2017.
 */

public class BaglantıKatmani {
    SQLiteDatabase db;
    Veritabanı vb;
    public  BaglantıKatmani(Context c){
        vb=new Veritabanı(c);
    }
 public  void ac{
        db=vb.getWritableDatabase();
    }
    public  void kapat{
        vb.close();
    }
}
