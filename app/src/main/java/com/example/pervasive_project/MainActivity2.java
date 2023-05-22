package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setContentView(R.layout.activity_main2);
        spinner=findViewById(R.id.spinnerId);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (id==1) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity_Basic_calculator.class);
                    startActivity(intent);
                } else if (id==2) {
                    Intent intent = new Intent(getApplicationContext(), Activity_scientifique_Calculator.class);
                    startActivity(intent);
                } else if (id==3) {
                    Intent intent = new Intent(getApplicationContext(), Activity_quiz1.class);
                    startActivity(intent);

                } else if (id==4) {
                    Intent intent = new Intent(getApplicationContext(), MainActivityBmi_CAL.class);
                    startActivity(intent);

                }

                else if (id==5){
                    Intent intent = new Intent(getApplicationContext(), MainActivityMoney_convart.class);
                    startActivity(intent);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Log.i("A","NOthing selected");


            }
        });
    }
}



