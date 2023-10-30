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

public class ThreeNumberHCF extends Fragment {
    private View view;
    private EditText num1, num2, num3;
    private TextView setResult;
    private Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_three_number_h_c, container, false);
        initViews();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().equals("")|| num2.getText().toString().equals("")|| num3.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Please Enter number in all fields!", Toast.LENGTH_SHORT).show();
                }
                else {
                    setResult.setText(Integer.toString(GetHCF.getHCF(num1,num2,num3)));
                    GetHCF.resetValue();
                }
            }
        });
        return view;
    }

    private void initViews(){
        num1 = view.findViewById(R.id.firstNumber_threeNumber_hcf);
        num2 = view.findViewById(R.id.secondtNumber_threeNumber_hcf);
        num3 = view.findViewById(R.id.thirdNumber_threeNumber_hcf);
        setResult = view.findViewById(R.id.resultField_threeNumber_hcf);
        submitButton = view.findViewById(R.id.submitButton_threeNumber_hcf);
    }
}