package com.example.finprov1.recommended;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finprov1.R;
import com.example.finprov1.databinding.FragmentHomeBinding;
import com.example.finprov1.latestupdates.LatestUpdatesAdapter;
import com.example.finprov1.latestupdates.LatestUpdatesModel;
import com.example.finprov1.news.NewsActivity;
import com.example.finprov1.placefacility.PlaceAndFacilityActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecommendedAdapter recommendedAdapter = new RecommendedAdapter();
        LatestUpdatesAdapter latestUpdatesAdapter = new LatestUpdatesAdapter();
        binding.rvRecom.setAdapter(recommendedAdapter);
        binding.rvRecom.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvLatest.setAdapter(latestUpdatesAdapter);
        binding.rvLatest.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvPopular.setAdapter(recommendedAdapter);
        binding.rvPopular.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));

        binding.btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), NewsActivity.class);
                startActivity(intent);
            }
        });

        binding.btnPf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), PlaceAndFacilityActivity.class);
                startActivity(intent);
            }
        });

        binding.btnShowAllCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlaceAndFacilityActivity();
            }
        });

        binding.btnShowAllPopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlaceAndFacilityActivity();
            }
        });

        binding.btnShowAllLatestUpdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNewsActivity();
            }
        });

        List<RecommendedModel> listRecommended = new ArrayList<>();
        listRecommended.add(new RecommendedModel("BINUS Baketball Court", "BINUS Baketball Court", R.drawable.paf1));
        listRecommended.add(new RecommendedModel("UPH Basketball Court", "UPH Basketball Court", R.drawable.paf2));
        listRecommended.add(new RecommendedModel("UNESA Tennis Court", "UNESA Tennis Court", R.drawable.paf3));
        listRecommended.add(new RecommendedModel("SMK St. Louis Basketball Court", "SMK St. Louis Basketball Court", R.drawable.paf4));
        listRecommended.add(new RecommendedModel("GBK Lapangan B", "GBK Lapangan B", R.drawable.paf5));
        recommendedAdapter.setData(listRecommended);

        List<LatestUpdatesModel> listLatestUpdates = new ArrayList<>();
        listLatestUpdates.add(new LatestUpdatesModel("Indonesia akan melawan Argentina di GBK", "Indonesia akan melawan Argentina di GBK", R.drawable.news1));
        listLatestUpdates.add(new LatestUpdatesModel("Indonesia Juara SEA Games 2023 Cabang Sepak Bola", "Indonesia Juara SEA Games 2023 Cabang Sepak Bola", R.drawable.news2));
        listLatestUpdates.add(new LatestUpdatesModel("BINUS Membuka Lapangan Sepak Bola Pertama", "BINUS Membuka Lapangan Sepak Bola Pertama", R.drawable.news3));
        listLatestUpdates.add(new LatestUpdatesModel("Tournament Mobile Legend Terbesar di dunia", "Tournament Mobile Legend Terbesar di dunia", R.drawable.news4));
        listLatestUpdates.add(new LatestUpdatesModel("BOOM ID Juara VCT Indonesia", "BOOM ID Juara VCT Indonesia", R.drawable.news5));
        latestUpdatesAdapter.setData(listLatestUpdates);
    }

    public void goToPlaceAndFacilityActivity() {
        Intent intent = new Intent(requireContext(), PlaceAndFacilityActivity.class);
        startActivity(intent);
    }

    public void goToNewsActivity() {
        Intent intent = new Intent(requireContext(), NewsActivity.class);
        startActivity(intent);
    }
}