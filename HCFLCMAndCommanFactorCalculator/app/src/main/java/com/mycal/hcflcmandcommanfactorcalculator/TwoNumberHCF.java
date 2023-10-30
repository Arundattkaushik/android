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

public class TwoNumberHCF extends Fragment {
    private View view;
    private EditText firstNumber, secondNumber;
    private TextView setResult;
    private Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_two_number_h_c, container, false);
        initElements();
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber.getText().toString().equals("")|| secondNumber.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Please Enter Numbers in the fields", Toast.LENGTH_LONG).show();
                }else {
                    setResult.setText("HCF: "+Integer.toString(GetHCF.getHCF(firstNumber,secondNumber)));
                    GetHCF.resetValue();
                }
            }
        });
        return view;
    }

    private void initElements(){
        firstNumber = view.findViewById(R.id.firstNumber_twoNumber_hcf);
        secondNumber = view.findViewById(R.id.secondNumber_twoNumber_hcf);
        setResult = view.findViewById(R.id.resultField_twoNumber_hcf);
        submitButton = view.findViewById(R.id.submitButton_twoNumber_hcf);
    }
}