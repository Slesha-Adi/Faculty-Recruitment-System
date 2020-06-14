package com.example.skillupcosc_mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerActivity extends AppCompatActivity {
    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.RegistrationPage);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Code for uploading datd to the db

                Intent i1 = new Intent(registerActivity.this,MainActivity.class);
                startActivity(i1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(registerActivity.this,MainActivity.class);
                startActivity(i2);
            }
        });
    }
}