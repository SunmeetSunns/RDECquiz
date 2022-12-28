package com.example.rdecquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class QuizPage extends AppCompatActivity {
    ImageButton JavaQ;
    ImageButton PythonQ;
    ImageButton CQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);
        JavaQ=findViewById(R.id.java);
        PythonQ=findViewById(R.id.python);
        CQ=findViewById(R.id.c);
    }
    public void page(View jav){

        Intent JavaP=new Intent(this,Java.class);
        startActivity(JavaP);
    }
    public void python(View jav){

        Intent Python=new Intent(this,Python1.class);
        startActivity(Python);
    }
    public void c(View jav){

        Intent C=new Intent(this,C1.class);
        startActivity(C);
    }
}