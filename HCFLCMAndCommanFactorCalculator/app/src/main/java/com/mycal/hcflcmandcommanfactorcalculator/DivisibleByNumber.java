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

public class DivisibleByNumber extends Fragment {

    private View view;
    private EditText num1;
    private TextView setResult;
    private Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_divisible_by_number, container, false);
        initViews();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Enter a number!", Toast.LENGTH_SHORT).show();
                }
                else{
                    setResult.setText(Integer.toString(GetHCF.getNumberDivisibleBy(num1)));
                    GetHCF.resetValue();
                }
            }
        });
        return view;
    }

    private void initViews(){
        num1 = view.findViewById(R.id.getNumber_divisibleBy_field);
        setResult = view.findViewById(R.id.setResult_divisibleBy_field);
        submitButton = view.findViewById(R.id.submitButton_divisibleBy_field);
    }
}