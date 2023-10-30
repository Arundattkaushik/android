package com.adk.testemptyview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  EditText age, length_inches, length_feet, length_weight;
    private RadioButton radio_button_male, radio_button_female;
    private Button button;
    TextView result;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        initViews();
        buttonClick();
    }


    private void initViews(){
            image = findViewById(R.id.img_bmi);
            radio_button_male = findViewById(R.id.radio_button_male);
            radio_button_female = findViewById(R.id.radio_button_female);
            age = findViewById(R.id.age_bmi);
            length_inches = findViewById(R.id.inches_bmi);
            length_feet = findViewById(R.id.feet_bmi);
            length_weight = findViewById(R.id.weight_kg_bmi);
            button = findViewById(R.id.calculate_button_bmi);
            result = findViewById(R.id.calculate_result);
    }

    private void buttonClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr_age = age.getText().toString();
                String usr_len_feet = length_feet.getText().toString();
                String usr_len_inches = length_inches.getText().toString();
                String usr_len_weight = length_weight.getText().toString();
//                result.setText("Age = "+user_age+ " & Length = "+user_len_feet+ " feet & " +user_len_inches+" inches & weight = "+user_len_weight);

                double usr_height = Integer.parseInt(usr_len_feet)*0.3048 +Integer.parseInt(usr_len_inches)*0.0254;
                int bmi = (int) (Integer.parseInt(usr_len_weight)/(usr_height*usr_height));

                if (bmi < 18.5) {
                    if(radio_button_male.isChecked()){
                        result.setText(bmi +" - Please consult with your boy doctor for healty weight..!");
                    } else if (radio_button_female.isChecked()) {
                        result.setText(bmi +" - Please consult with your girl doctor for healty weight..!");
                    }else{
                        result.setText("Please consult with your doctor for healty weight..!");
                    }
                } else if (bmi > 25) {
                    result.setText(bmi+" You are over weight..!");
                }else {
                    result.setText(bmi+ " You are healthy weight..!");
                }
            }
        });
    }

}