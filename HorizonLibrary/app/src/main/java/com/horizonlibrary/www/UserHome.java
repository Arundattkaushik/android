package com.horizonlibrary.www;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserHome extends AppCompatActivity {
    TextView userRecID, userRecPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        initViews();
        setViews(MainActivity.getID(), MainActivity.getPassword());
    }

    private void initViews(){
            userRecID = findViewById(R.id.user_rec_id);
            userRecPass = findViewById(R.id.user_rec_password);
    }

    private void setViews(String id, String pass){
        userRecID.setText(id);
        userRecPass.setText(pass);
    }
}