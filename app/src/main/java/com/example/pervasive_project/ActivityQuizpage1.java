package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class ActivityQuizpage1 extends AppCompatActivity {
    int temp,finalScore;
    RadioGroup q2Radio;
    public static String finalResult ="marks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpage1);
        q2Radio = findViewById(R.id.q2Radiogrp);

        Intent intent = getIntent();
        temp = intent.getIntExtra("score",0);
        finalScore = temp;

        System.out.println("Temp" + temp);
    }
    public void Q2RadioFunc(View view) {
        if(q2Radio.getCheckedRadioButtonId()==R.id.radioButtonQ1){
            finalScore=temp+5;
        }
    }

    public void Q2PreFunc(View view) {
        Intent myIntent=new Intent(this,Activity_quiz1.class);

        startActivity(myIntent);
    }

    public void Q2NextFunc(View view) {
    Intent myIntent=new Intent(this, Activityquizresult.class);
        if(q2Radio.getCheckedRadioButtonId()==R.id.radioButtonQ1){
        finalScore=temp+5;
    }
        myIntent.putExtra("score", finalScore);
        startActivity(myIntent);
}
}