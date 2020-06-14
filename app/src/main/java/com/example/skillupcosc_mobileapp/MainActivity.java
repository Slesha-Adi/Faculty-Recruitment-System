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

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.register);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent i1=new Intent(MainActivity.this,register.class);
              //  startActivity(i1);
            }
        });
        button2=(Button)findViewById(R.id.login);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i2=new Intent(MainActivity.this,login.class);
               startActivity(i2);
            }
        });
    }
}
