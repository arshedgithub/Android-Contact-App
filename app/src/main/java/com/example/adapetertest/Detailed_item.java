package com.example.adapetertest;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.adapetertest.databinding.ActivityDetailedItemBinding;

public class Detailed_item extends AppCompatActivity {

    ActivityDetailedItemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("contactName");
            String contactNumber = intent.getStringExtra("contactNumber");
            String city = intent.getStringExtra("city");
            int imageId = intent.getIntExtra("image", R.drawable.john_doe);

            binding.detailName.setText(name);
            binding.detailContactNo.setText(contactNumber);
            binding.detailCity.setText(city);
            binding.detailImage.setImageResource(imageId);
        }
    }
}