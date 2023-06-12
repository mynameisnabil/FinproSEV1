package com.example.finprov1.community;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.finprov1.ProfileFragment;
import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityCommunityBinding;
import com.example.finprov1.recommended.HomeFragment;
import com.example.finprov1.transaction.HistoryFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class CommunityActivity extends AppCompatActivity implements CommunityAdapter.OnCommunityClickListener {

    private List<CommunityModel> communityList;

    private CommunityAdapter adapter;

    private ActivityCommunityBinding binding;

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();

    ProfileFragment profileFragment = new ProfileFragment();

    HistoryFragment historyFragment = new HistoryFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommunityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvCommunity.setLayoutManager(new LinearLayoutManager(this));

        communityList = new ArrayList<>();

        communityList.add(new CommunityModel("Community 1", "Jajang - Jakarta", R.drawable.ic_launcher_background, "Community 1"));
        communityList.add(new CommunityModel("Community 2", "Jajang - Jakarta", R.drawable.ic_launcher_background, "Community 1"));
        communityList.add(new CommunityModel("Community 3", "Jajang - Jakarta", R.drawable.ic_launcher_background, "Community 1"));
        communityList.add(new CommunityModel("Community 4", "Jajang - Jakarta", R.drawable.ic_launcher_background, "Community 1"));
        communityList.add(new CommunityModel("Community 5", "Jajang - Jakarta", R.drawable.ic_launcher_background, "Community 1"));

        adapter = new CommunityAdapter(communityList, this);
        binding.rvCommunity.setAdapter(adapter);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onCommunityClick(CommunityModel communityModel) {
        Intent intent = new Intent(this, CommunityDetail.class);
        intent.putExtra("title", communityModel.getTitle());
        intent.putExtra("author_location", communityModel.getAuthor_location());
        intent.putExtra("image", communityModel.getImageResourceId());
        intent.putExtra("description", communityModel.getDescription());
        startActivity(intent);



    }
}