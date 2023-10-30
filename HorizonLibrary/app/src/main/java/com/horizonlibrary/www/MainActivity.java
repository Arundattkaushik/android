package com.horizonlibrary.www;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected static String ID = null, Password = null, defID = "arun.datt@kaptune.com", defPassword = "arun.datt";


    EditText userId, userPass;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        submit();
    }

    private void initViews(){
        userId = findViewById(R.id.user_id);
        userPass = findViewById(R.id.user_password);
        submitButton = findViewById(R.id.submit_button);
    }

    public static String getID(){
        return ID;
    }

    protected static String getPassword(){
        return Password;
    }

    private void submit(){
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userHomePage = new Intent(MainActivity.this, UserHome.class);
                ID = userId.getText().toString();
                Password = userPass.getText().toString();

                if(ID.equals(defID) && Password.equals(defPassword)){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(userHomePage);
                }
                else {
                    Toast.makeText(MainActivity.this, "userID or password is incorrect", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}