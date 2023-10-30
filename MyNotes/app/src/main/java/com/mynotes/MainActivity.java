package com.mynotes;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.mynotes.databinding.ActivityMainBinding;
import com.mynotes.databinding.MainMenuBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(mainBinding.getRoot());
        initViews();
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Home");

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer
        );

        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }



    private void initViews(){
        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.app_toolbar_header);
    }

}