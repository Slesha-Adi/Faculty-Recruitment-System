package com.example.skillupcosc_mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rolelist extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rolelist);
        b1 = (Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for uploading datd to the db

                Intent i1 = new Intent(rolelist.this, details.class);
                startActivity(i1);
            }
        });

        b2 = (Button) findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for uploading datd to the db

                Intent i2 = new Intent(rolelist.this, homepage.class);
                startActivity(i2);
            }
        });

        b3 = (Button) findViewById(R.id.btn);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for uploading datd to the db

                Intent i3 = new Intent(rolelist.this, details.class);
                startActivity(i3);
            }
        });
    }

}