package com.adk.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView text_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text_t = findViewById(R.id._text_rec);

        Toast.makeText(this,  "Activity 2 "+MainActivity.getValue(), Toast.LENGTH_SHORT).show();
        text_t.setText(MainActivity.getValue());
    }
}