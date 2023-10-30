package com.my.contactlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> contactList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Prepare a dataset now
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));
        contactList.add(new ContactModel(R.drawable.ic_launcher_foreground, "Ram", "9876543210"));

    }
}