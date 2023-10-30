package com.my.phone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton addButton;
    ContactAdapter adapter;
    RecyclerView recyclerView;

    ArrayList<ContactModel> contactsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.contact_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        //Creating data set
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Reshma", "1234567890"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "fatima", "1234567891"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "karim", "1234567892"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Gautam", "1234567893"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Rahul", "1234567894"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Vikash", "1234567895"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Harpal", "1234567896"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Godha", "1234567897"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Modi", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Sonal", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Rikul", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Anchal", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Nitish", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Shakti", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Saksham", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Geeta", "1234567898"));
        contactsList.add(new ContactModel(R.drawable.pngwing_com, "Sonal", "1234567898"));

        adapter = new ContactAdapter(this, contactsList);
        recyclerView.setAdapter(adapter);
        initViews();
        onClickAddContact(addButton);
    }

    private void initViews(){
            addButton = findViewById(R.id.add_button);
    }

    private void onClickAddContact(FloatingActionButton button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.alert_dialog_box);

                EditText name = dialog.findViewById(R.id.editName);
                EditText number = dialog.findViewById(R.id.editNumber);
                Button btnAction = dialog.findViewById(R.id.action_button);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String updatedName ="", updatedNumber="";
                        if (!name.getText().toString().equals("")){
                            updatedName = name.getText().toString();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Name field can't empty!", Toast.LENGTH_SHORT).show();
                        }

                        if (!number.getText().toString().equals("")){
                            updatedNumber = number.getText().toString();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Number field can't empty!", Toast.LENGTH_SHORT).show();
                        }

                        contactsList.add(new ContactModel(R.drawable.pngwing_com ,updatedName, updatedNumber));
                        adapter.notifyItemInserted(contactsList.size()-1);
                        recyclerView.scrollToPosition(contactsList.size()-1);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
}