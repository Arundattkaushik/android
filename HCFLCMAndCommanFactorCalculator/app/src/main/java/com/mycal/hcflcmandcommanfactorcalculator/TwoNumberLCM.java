package com.mycal.hcflcmandcommanfactorcalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mycal.hcflcmandcommanfactorcalculator.methods.GetHCF;

import java.util.Objects;
import java.util.Set;

public class TwoNumberLCM extends Fragment {

    private View view;
    private EditText firstNumber, secondNumber;
    private TextView setResult;
    private Button submitButton;
    int lcm, productOfNumbers, hcf;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_two_number_l_c_m, container, false);

        initViews();
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber.getText().toString().equals("")|| secondNumber.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Please Enter Numbers in the fields", Toast.LENGTH_LONG).show();
                }
                else {
                    hcf = GetHCF.getHCF(firstNumber,secondNumber);
                    productOfNumbers = GetHCF.productOfNumbers(firstNumber, secondNumber);
                    lcm = productOfNumbers/hcf;
                    setResult.setText("LCM: "+Integer.toString(lcm));
                    GetHCF.resetValue();
                }
            }
        });

        return view;
    }

    private void initViews(){
        firstNumber = view.findViewById(R.id.firstNumber_twoNumber_lcm);
        secondNumber = view.findViewById(R.id.secondNumber_twoNumber_lcm);
        setResult = view.findViewById(R.id.resultField_twoNumber_lcm);
        submitButton = view.findViewById(R.id.submitButton_twoNumber_lcm);
    }
}