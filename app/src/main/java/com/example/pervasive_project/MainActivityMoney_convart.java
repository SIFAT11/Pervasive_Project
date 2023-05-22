package com.example.pervasive_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityMoney_convart extends AppCompatActivity {
    Button freagmentbbtnid,freagmentbbtnid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_money_convart);
        freagmentbbtnid =findViewById(R.id.freagmentbbtnid);
        freagmentbbtnid2 = findViewById(R.id.freagmentbbtnid2);
        freagmentbbtnid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replace(new BlankFragment_BDT());

            }
        });
        freagmentbbtnid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replace(new BlankFragment_USD());

            }
        });
    }

    private void replace(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}