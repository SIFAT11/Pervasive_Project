package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity_Basic_calculator extends AppCompatActivity {
    TextView primaryView,showOutput;
    Button numBtn;
    Double pi = 3.1416,num1,num2,result;
    String primaryValue,operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_basic_calculator);
        primaryView=findViewById(R.id.primaryViewId);
        showOutput=findViewById(R.id.showOutputId);
    }

    public void ClearFunction(View view) {
        primaryView.setText(" ");
    }

    @SuppressLint("SetTextI18n")
    public void OperatorFunc(View view) {
        num1=Double.parseDouble(primaryView.getText().toString()) ;
        numBtn=findViewById(view.getId());
        operator=numBtn.getText().toString();
        showOutput.setText(num1+""+operator);
        primaryView.setText("0");
    }

    @SuppressLint("SetTextI18n")
    public void NumberFunc(View view) {
        numBtn=findViewById(view.getId());

        primaryValue=primaryView.getText().toString();
        if (primaryValue.equals("0")){
            primaryView.setText(numBtn.getText().toString());
        }
        else {
            primaryView.setText(primaryValue+ numBtn.getText().toString());
        }
    }

    public void resultFunction(View view) {
        num2=Double.parseDouble(primaryView.getText().toString());
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        showOutput.setText(num1+operator+primaryView.getText().toString());
//        primaryView.setText(""+result);
        primaryView.setText(result.toString());

    }
}