package com.example.rdecquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Admin(View view){
        Intent admin=new Intent(this,PasswordMatch.class);
        startActivity(admin);


    }
    public void Login(View log){
        Intent login=new Intent(this,QuizPage.class);
        startActivity(login);
    }
}