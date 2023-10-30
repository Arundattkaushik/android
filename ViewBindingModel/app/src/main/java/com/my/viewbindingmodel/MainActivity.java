package com.my.viewbindingmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.my.viewbindingmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainBinding.firstNumberThreeNumberHcf.setText("hello 1");
        mainBinding.secondtNumberThreeNumberHcf.setText("hello 2");
        mainBinding.thirdNumberThreeNumberHcf.setText("hello 3");
        mainBinding.resultFieldThreeNumberHcf.setText("hello 4");
        mainBinding.submitButtonThreeNumberHcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainBinding.submitButtonThreeNumberHcf.setAllCaps(true);
            }
        });
    }
}