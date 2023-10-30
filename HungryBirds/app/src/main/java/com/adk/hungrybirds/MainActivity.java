package com.adk.hungrybirds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainsCard;
    CardView deseretCard;
    TextView starter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getIds();
        onClickStarterCard();
        onClickMainsCourse();
        onClickDesertsCard();

    }

    private void getIds(){
        starterCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main_course);
        starter = findViewById(R.id._starter);
        deseretCard = findViewById(R.id.card_view_deserts);
    }

    private void onClickStarterCard(){
        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starter_Activity = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(starter_Activity);
            }
        });
    }

    private void onClickMainsCourse(){
        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCourseIntent = new Intent(MainActivity.this, MainCourses.class);
                startActivity(mainCourseIntent);
            }
        });
    }

    private void onClickDesertsCard(){
        deseretCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desertCardIntent = new Intent(MainActivity.this, DesertsActivity.class);
                startActivity(desertCardIntent);
            }
        });
    }
}