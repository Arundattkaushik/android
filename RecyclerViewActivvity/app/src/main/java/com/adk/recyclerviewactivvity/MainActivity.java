package com.adk.recyclerviewactivvity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Id of main card created in activity_main.xml
        RecyclerView recycler_items = findViewById(R.id.recycler_list_view);

        //Array of class which contains the structure of list item
        RecyclerItems[] recyclerItems = {
                new RecyclerItems("title 1", "description 1", R.drawable.ic_launcher_background ),
                new RecyclerItems("title 2", "description 2", R.drawable.ic_launcher_background),
                new RecyclerItems("title 3", "description 3", R.drawable.ic_launcher_background ),
                new RecyclerItems("title 4", "description 4", R.drawable.ic_launcher_background ),
                new RecyclerItems("title 5", "description 5", R.drawable.ic_launcher_background ),
                new RecyclerItems("title 6", "description 6", R.drawable.ic_launcher_background ),
                new RecyclerItems("title 7", "description 7", R.drawable.ic_launcher_background ),
                new RecyclerItems("title 8", "description 8", R.drawable.ic_launcher_background )
        };

        Recycler_Adapter adapter = new Recycler_Adapter(recyclerItems);
        recycler_items.setAdapter(adapter);
    }
}