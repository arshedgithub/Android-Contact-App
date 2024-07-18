package com.example.adapetertest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.adapetertest.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ContactAdapter contactAdapter;
    private ArrayList<Contact> contactArrayList = new ArrayList<>();
    Contact contactData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] allContacts = getResources().getStringArray(R.array.contacts);
        String[] allContactNo = getResources().getStringArray(R.array.contact_numbers);
//        populateContactList(allContacts);

        for (int i = 0; i < allContacts.length; i++) {
            contactArrayList.add(new Contact(allContacts[i], "", "", R.drawable.john_doe));
        }

        contactAdapter = new ContactAdapter(MainActivity.this, contactArrayList);
        binding.listView.setAdapter(contactAdapter);
        binding.listView.setClickable(true);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detailed_item.class);
                intent.putExtra("name", allContacts[i]);
                intent.putExtra("contactNumber", allContactNo[i]);
                startActivity(intent);
            }
        });
    }

//    public void populateContactList(String[] contacts){
//        contactArrayList.add(new Contact(contacts[0], R.drawable.john_doe));
//        contactArrayList.add(new Contact(contacts[1], R.drawable.john_doe));
//    }
}