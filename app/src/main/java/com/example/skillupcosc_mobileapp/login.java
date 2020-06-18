package com.example.skillupcosc_mobileapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private Button Button1;
    private Button Button2;
    private TextView Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button1=(Button)findViewById(R.id.button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(login.this,homepage.class);
                startActivity(i1);
            }
        });
        Button2=(Button)findViewById(R.id.button2);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i2=new Intent(login.this,MainActivity.class);
                 startActivity(i2);
            }
        });
        Tv=(TextView)findViewById(R.id.textView10);
        Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(login.this, registration.class);
            }
        });

    }
}
