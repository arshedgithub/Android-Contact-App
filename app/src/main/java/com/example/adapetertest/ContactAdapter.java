package com.example.adapetertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {
    private ArrayList<Contact> contactArrayList;

    public ContactAdapter(@NonNull Context context, ArrayList<Contact> contactArrayList) {
        super(context, R.layout.list_item, contactArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Contact contactData = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView contactImage = convertView.findViewById(R.id.list_image);
        TextView contactName = convertView.findViewById(R.id.list_name);

        contactImage.setImageResource(contactData.getImageId());
        contactName.setText(contactData.getContactName());

        return convertView;
    }
}
