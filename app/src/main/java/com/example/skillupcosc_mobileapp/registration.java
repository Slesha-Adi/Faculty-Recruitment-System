package com.example.skillupcosc_mobileapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    private Button registerButton;
    private Button loginButton;
    private Button backButton;

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    private EditText f_name;
    private EditText l_name;
    private EditText password;
    private EditText email;
    private EditText phone_number;
    private EditText aadhar;
    private EditText qualifications;
    private EditText dept_qualified;
    private EditText college_name;
    private EditText cgpa;
    private EditText college_batch;
    private EditText dob;
    private EditText cuurent_address;
    private EditText permanent_address;
    private EditText experience;
    private EditText previous_office;
    private EditText previous_position;
    private EditText achievements;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        registerButton = (Button) findViewById(R.id.buttonRegister);
        loginButton = (Button) findViewById(R.id.buttonlogin);
        backButton = (Button) findViewById(R.id.back);
        f_name = (EditText) findViewById(R.id.firstName);
        l_name = (EditText) findViewById(R.id.lastName);
        password = (EditText) findViewById(R.id.registerpassword);
        email = (EditText) findViewById(R.id.emailID);
        phone_number = (EditText) findViewById(R.id.phoneNumber);
        aadhar = (EditText) findViewById(R.id.aadharNumber);
        qualifications = (EditText) findViewById(R.id.qualifications);
        dept_qualified = (EditText) findViewById(R.id.dept_qualified);
        college_name = (EditText) findViewById(R.id.collegeName);
        cgpa = (EditText) findViewById(R.id.cgpa);
        college_batch = (EditText) findViewById(R.id.college_batch);
        dob = (EditText) findViewById(R.id.dob);
        cuurent_address = (EditText) findViewById(R.id.current_address);
        permanent_address = (EditText) findViewById(R.id.permanent_address);
        achievements = (EditText) findViewById(R.id.achievements);
        experience = (EditText) findViewById(R.id.experience);
        previous_office = (EditText) findViewById(R.id.previousOffice);
        previous_position = (EditText) findViewById(R.id.previousPosition);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);


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
    public void rbClick(View v){ // Code for gender radio button onclick function
        int radioButtonId= radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(radioButtonId);
    }
}