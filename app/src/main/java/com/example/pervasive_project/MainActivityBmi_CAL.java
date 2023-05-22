package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityBmi_CAL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bmi_cal);
        EditText editTextweight =findViewById(R.id.weight);
        EditText editTextHeight =findViewById(R.id.hight);
        Button button =findViewById(R.id.btnbmibutton);
        TextView textView =findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height =Float.parseFloat(String.valueOf(editTextHeight.getText()))/100;
                float weight =Float.parseFloat(String.valueOf(editTextweight.getText()));
                float bmi =weight/(height*height);
                textView.setText(String.valueOf(bmi));

            }
        });
    }
}