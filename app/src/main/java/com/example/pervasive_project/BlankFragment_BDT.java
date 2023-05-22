package com.example.pervasive_project;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BlankFragment_BDT extends Fragment {
    private EditText inputAmount;
    private Button convertButton;
    private TextView resultText;
    private static final double BDT_TO_USD_RATE = 0.01;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank__b_d_t, container, false);
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

        // Convert BDT to USD
        double usdAmount = amount * BDT_TO_USD_RATE;
        resultText.setText(String.format("%.2f BDT = %.2f USD", amount, usdAmount));
    }
}