package com.example.rdecquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PasswordMatch extends  AppCompatActivity implements View.OnClickListener {
    EditText email;
    EditText password;
    String PasswordMatch="meet";
    String Email="Admin@gmail.com";
    TextView response;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_match);
        email=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);
        response=findViewById(R.id.Response);

    }


    @Override
    public void onClick(View view) {
        if(email.getText().toString()==Email && password.getText().toString()==PasswordMatch){
            Intent submit=new Intent(this,OptionPage.class);
            startActivity(submit);

        }
        else {
            Toast.makeText(this, "Your login details not matched !!!!", Toast.LENGTH_SHORT).show();
        }

    }
}