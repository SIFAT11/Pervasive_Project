package com.example.pervasive_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BlankFragment_USD extends Fragment {
    private EditText inputAmount;
    private Button convertButton;
    private TextView resultText;
    private static final double USD_TO_BDT_RATE = 100;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_blank__u_s_d, container, false);
        inputAmount = view.findViewById(R.id.input_amount);
        convertButton = view.findViewById(R.id.convert_button);
        resultText = view.findViewById(R.id.result_text);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency();
            }
        });

        return view;
    }

    private void convertCurrency() {
        String amountString = inputAmount.getText().toString();

        if (amountString.isEmpty()) {
            resultText.setText("Please enter an amount.");
            return;
        }

        double amount = Double.parseDouble(amountString);

        // Convert USD to BDT
        double bdtAmount = amount * USD_TO_BDT_RATE;
        resultText.setText(String.format("%.2f USD = %.2f BDT", amount, bdtAmount));

    }
}