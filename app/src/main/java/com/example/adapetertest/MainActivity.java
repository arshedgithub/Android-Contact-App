package com.example.adapetertest;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contactArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        contactArrayList = new ArrayList<>();

        String[] allContacts = getResources().getStringArray(R.array.contacts);
        populateContactList(allContacts);

//        ContactAdapter adapter = new ContactAdapter(getApplicationContext(), R.layout.list_item, contactArrayList);
//        ListView listView = findViewById(R.id.contact_list);
//        listView.setAdapter(adapter);

    }

    public void populateContactList(String[] contacts){
        contactArrayList.add(new Contact(contacts[0], R.drawable.john_doe));
        contactArrayList.add(new Contact(contacts[1], R.drawable.john_doe));
    }
}