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

    public ContactAdapter(@NonNull Context context, int resource, ArrayList<Contact> contactArrayList) {
        super(context, resource);
        this.contactArrayList = contactArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int contactIndex = position;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
//        ImageView contactImage = convertView.findViewById(R.id.contact_image);
        TextView contactName = convertView.findViewById(R.id.contact_name);

//        contactImage.setImageResource(contactArrayList.get(position).getImageId());
        contactName.setText(contactArrayList.get(position).getContactName());
        return convertView;
    }
}
