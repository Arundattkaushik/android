package com.adk.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static String value = null;
    Intent intent;
    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
        butttonClick();
    }

    private void initializeVariables(){
        text = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
    }

    public static String getValue(){
        return value;
    }

    private void butttonClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, MainActivity2.class);
                //Toast.makeText(MainActivity.this, "Hi you are ok.", Toast.LENGTH_SHORT).show();
                value = text.getText().toString();
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}