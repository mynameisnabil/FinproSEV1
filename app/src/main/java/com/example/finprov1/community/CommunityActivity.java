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

public class CommunityActivity extends AppCompatActivity {

    private ActivityCommunityBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommunityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CommunityAdapter adapter = new CommunityAdapter();
        binding.rvCommunity.setAdapter(adapter);
        binding.rvCommunity.setLayoutManager(new LinearLayoutManager(this));

        List<CommunityModel> listCommunity = new ArrayList<>();
        listCommunity.add(new CommunityModel("PERSIJA Football Community", "BINUS Basketball Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Jakarta","07.00-22.00", "Rp. 100.000", "Liam Anderson", "08912317865", "liam@gmail.com", R.drawable.persija, -6.20201, 106.78113));
        listCommunity.add(new CommunityModel("BINUS Mobile Legend Community", "BINUS Mobile Legend Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Jakarta","07.00-22.00", "Rp. 100.000", "Olivia Martinez", "081238726789", "olivia@gmail.com", R.drawable.binusmobil, -6.20201, 106.78113));
        listCommunity.add(new CommunityModel("BINUS Tennis Community", "BINUS Tennis Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Jakarta","07.00-22.00", "Rp. 100.000", "Mason Thompson", "08198456789", "mason@gmail.com", R.drawable.binustenis, -6.20201, 106.78113));
        listCommunity.add(new CommunityModel("BINUS Basketball Community", "BINUS Basketball Community adalah komunitas yang didirikan pada tahun 2005 oleh...", "Jakarta","07.00-22.00", "Rp. 100.000", "Lucas Robinson", "08123459889", "lucas@gmail.com", R.drawable.binusbasket, -6.20201, 106.78113));
        adapter.setData(listCommunity);


        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}