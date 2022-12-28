package com.example.rdecquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

public class Java extends AppCompatActivity implements View.OnClickListener{
    TextView totalques;
    TextView ques;
    Button AnsA;
    Button AnsB;
    Button AnsC;
    Button AnsD;
    Button submit;
    int score;
    int TotalQuestion=Questions.QuestionsJ.length;
    String selAns="";
    int Index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        totalques=findViewById(R.id.totq);
        AnsA=findViewById(R.id.AnsA);
        AnsB=findViewById(R.id.AnsB);
        AnsC=findViewById(R.id.AnsC);
        AnsD=findViewById(R.id.AnsD);
        submit=findViewById(R.id.Submit);
        ques=findViewById(R.id.Questions);
        AnsA.setOnClickListener(this);
        AnsB.setOnClickListener(this);
        AnsC.setOnClickListener(this);
        AnsD.setOnClickListener(this);
        submit.setOnClickListener(this);
        totalques.setText("Total Question :"+TotalQuestion);
        loadNewQues();




    }

    private void loadNewQues() {
        if(Index==TotalQuestion){
            finishQuiz();
            return;
        }
        ques.setText(Questions.QuestionsJ[Index]);
        AnsA.setText(Questions.ChoicesJ[Index][0]);
        AnsB.setText(Questions.ChoicesJ[Index][1]);
        AnsC.setText(Questions.ChoicesJ[Index][2]);
        AnsD.setText(Questions.ChoicesJ[Index][3]);
    }

    private void finishQuiz() {
        String passStatus="";
        if(score>TotalQuestion*0.33){
            passStatus="Congratulations !!!! You Passed";
        }
        else{
            passStatus="Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus).setMessage("Score is"+score+"out of"+TotalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz())
                .setCancelable(false)
                .show();
    }

    private void restartQuiz() {
        score=0;
        Index=0;
        loadNewQues();

    }

    @Override
    public void onClick(View view) {
        Button clickedButton=(Button) view;
        AnsA.setBackgroundColor(Color.BLACK);
        AnsB.setBackgroundColor(Color.BLACK);
        AnsC.setBackgroundColor(Color.BLACK);
        AnsD.setBackgroundColor(Color.BLACK);
        if(clickedButton.getId()==R.id.Submit){
            if(selAns.equals(Questions.AnswersJ[Index])){
                score++;
            }
            Index++;
            loadNewQues();


        }else{
            selAns=clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }

    }
    }
