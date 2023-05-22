package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activityquizresult extends AppCompatActivity {
    TextView outputView;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityquizresult);
        Intent myGetIntent = getIntent();


        value=getIntent().getIntExtra("score",0);
        outputView=findViewById(R.id.outputViewId);
        outputView.setText("values: "+value);
        System.out.println("Temp: " + value);
    }

    public void TRYFunction(View view) {
        Intent myIntent = new Intent(this,Activity_quiz1.class);
        startActivity(myIntent);
    }
}