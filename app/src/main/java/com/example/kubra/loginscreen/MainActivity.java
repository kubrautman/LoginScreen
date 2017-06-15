package com.example.kubra.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import  android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button doLogin;
    EditText uName;
    EditText pass;
    String user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doLogin = (Button) findViewById(R.id.doLogin);
        uName = (EditText) findViewById(R.id.LoginName);
        pass = (EditText) findViewById(R.id.Password);








        doLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uName.getText().toString().equals("kubra") && pass.getText().toString().equals("123")){

                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);


                startActivity(intent);
            }
            else
                {
                    Toast.makeText(getApplicationContext(), "Şifreyi Hatalı Girdiniz", Toast.LENGTH_LONG).show();

                }

            }
        });


    }}

