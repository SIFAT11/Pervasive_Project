package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class Activity_quiz1 extends AppCompatActivity {
    int score = 0;
    RadioGroup q1Radio;
    public static String q1="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        q1Radio=findViewById(R.id.q1RadioGrp);
    }

    public void Q1RadioFunc(View view) {
        if(q1Radio.getCheckedRadioButtonId()==R.id.radioButton3Q1){
            score=5;
        }
    }

    public void Q1NextFunc(View view) {
        if(q1Radio.getCheckedRadioButtonId()==R.id.radioButton3Q1){
            score=5;
        }

        Intent myIntent=new Intent(this,ActivityQuizpage1.class);
        myIntent.putExtra("score",score);
        startActivity(myIntent);
    }

    public void Q1SubFunc(View view) {
        if(q1Radio.getCheckedRadioButtonId()==R.id.radioButton3Q1){
            score=5;
        }

        Intent myIntent=new Intent(this,Activityquizresult.class);

        myIntent.putExtra("score",score);
        startActivity(myIntent);
    }
}