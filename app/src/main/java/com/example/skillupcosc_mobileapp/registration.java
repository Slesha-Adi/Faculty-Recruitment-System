package com.example.skillupcosc_mobileapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    private Button registerButton;
    private Button loginButton;
    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        registerButton = (Button) findViewById(R.id.buttonRegister);
        loginButton = (Button) findViewById(R.id.buttonlogin);
        backButton = (Button) findViewById(R.id.back);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(getApplicationContext(),
                        "Registered Sucessfully!!",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(registration.this,login.class);
                startActivity(i1);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(registration.this,MainActivity.class);
                startActivity(i2);
            }
        });
    }
}