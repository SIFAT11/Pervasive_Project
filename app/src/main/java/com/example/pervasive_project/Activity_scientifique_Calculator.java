package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_scientifique_Calculator extends AppCompatActivity {
    TextView primaryView,showOutput;
    Button numBtn;
    Double pi = 3.1416,num1,num2,result;
    String primaryValue,operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientifique_calculator);
        primaryView=findViewById(R.id.primaryViewId);
        showOutput=findViewById(R.id.showOutputId);
    }
    public void numberFunction(View view) {
        numBtn=findViewById(view.getId());

        primaryValue=primaryView.getText().toString();
        if (primaryValue.equals("0")){
            primaryView.setText(numBtn.getText().toString());
        }
        else {
            primaryView.setText(primaryValue+ numBtn.getText().toString());
        }
    }

    public void clearFunction(View view) {
        primaryView.setText(" ");

    }

    public void operatorFunction(View view) {
        num1=Double.parseDouble(primaryView.getText().toString()) ;
        numBtn=findViewById(view.getId());
        operator=numBtn.getText().toString();
        showOutput.setText(num1+""+operator);
        primaryView.setText("0");
    }

    public void trigonmetryFunction(View view) {
        int id = view.getId();
        double input = 0; // get the ID of the button that was clicked

        try {
            input = Double.parseDouble(primaryView.getText().toString());
            // Process the valid input here
        } catch (NumberFormatException e) {
            // Display an error message to the user
            Toast.makeText(getApplicationContext(), "Please enter a valid number", Toast.LENGTH_SHORT).show();
        }

        double result = 0;

        if (id == R.id.sinId) {
            result = Math.sin(Math.toRadians(input));
        }
        else if (id == R.id.cosId) {
            result = Math.cos(Math.toRadians(input));
        }
        else if (id == R.id.tanId) {
            result = Math.tan(Math.toRadians(input));
        }

//        else if (id == R.id.cosecId) {
//            result = 1 / Math.sin(Math.toRadians(input));
//        }
//        else if (id == R.id.secId) {
//            result = 1 / Math.cos(Math.toRadians(input));
//        }
//        else if (id == R.id.cotId) {
//            result = 1 / Math.tan(Math.toRadians(input));
//        }
        else{
            result=0;
        }

        primaryView.setText(Double.toString(result));
    }
    public void resultFunction(View view) {
        num2=Double.parseDouble(primaryView.getText().toString());
        if(operator.equals("+")){
            result=num1+num2;
        }
        else if(operator.equals("-")){
            result=num1-num2;
        }
        else if(operator.equals("*")){
            result=num1*num2;
        }
        else if(operator.equals("/")){
            result=num1/num2;
        }
        showOutput.setText(num1+operator+primaryView.getText().toString());
//        primaryView.setText(""+result);
        primaryView.setText(result.toString());
    }

}