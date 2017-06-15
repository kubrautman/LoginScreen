package com.example.kubra.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.content.Intent;
import android.widget.TextView;


public class WelcomeActivity extends AppCompatActivity {
    TextView showTExt;
    String name;
    String passw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        showTExt=(TextView) findViewById(R.id.showData);
        Intent intent=getIntent();
        name=intent.getStringExtra("Name");
        passw=intent.getStringExtra("Password");
        showTExt.setText("Hoşgeldiniz" +name +passw);

    }



    

    @Override
    protected void onStart() {

        super.onStart();

    }

}
