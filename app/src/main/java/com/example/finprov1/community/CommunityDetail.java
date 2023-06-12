package com.example.finprov1.community;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityCommunityDetailBinding;

public class CommunityDetail extends AppCompatActivity {

    ActivityCommunityDetailBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommunityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            binding.communityTitle.setText(bundle.getString("title"));
            binding.communityAuthorLocation.setText(bundle.getString("author_location"));
            binding.communityImage.setImageResource(bundle.getInt("image"));
            binding.commnityDescription.setText(bundle.getString("description"));

        }
    }
}