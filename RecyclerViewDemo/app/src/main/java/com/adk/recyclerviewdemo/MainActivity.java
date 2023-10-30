package com.adk.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_card_main_activity);

        ListItem[] itemLists =
        {
                new ListItem("title 1", "description 1", R.drawable.ic_launcher_foreground ),
                new ListItem("title 2", "description 2", R.drawable.ic_launcher_background),
                new ListItem("title 3", "description 3", R.drawable.ic_launcher_background ),
                new ListItem("title 4", "description 4", R.drawable.ic_launcher_background ),
                new ListItem("title 5", "description 5", R.drawable.ic_launcher_background ),
                new ListItem("title 6", "description 6", R.drawable.ic_launcher_background ),
                new ListItem("title 7", "description 7", R.drawable.ic_launcher_background ),
                new ListItem("title 8", "description 8", R.drawable.ic_launcher_background ),
                new ListItem("title 9", "description 9", R.drawable.ic_launcher_background ),
        };

        ItemAdapter customAdapter = new ItemAdapter(itemLists);
        list.setAdapter(customAdapter);

    }
}