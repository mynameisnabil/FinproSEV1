package com.example.finprov1.recom;

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

        RecomendedAdapter adapter = new RecomendedAdapter();
        binding.rvRecom.setAdapter(adapter);
        binding.rvRecom.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvLatst.setAdapter(adapter);
        binding.rvLatst.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvPopular.setAdapter(adapter);
        binding.rvPopular.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));


        binding.btnPf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), PlaceAndFacilityActivity.class);
                startActivity(intent);
            }
        });


        List<RecomendedModel> listRecomended = new ArrayList<>();
        listRecomended.add(new RecomendedModel("Lapang 1", "Lapangan Latihan Persija Jakarta", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 2", "Lapangan Futsal Cibubur", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 3", "Lapangan Sepak Bola Senayan", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 4", "Lapangan Tenis Pondok Indah", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 5", "Lapangan Bulu Tangkis Grogol", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 6", "Lapangan Golf Pantai Indah Kapuk", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 7", "Lapangan Basket Kemang", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 8", "Lapangan Voli Slipi", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 9", "Lapangan Renang Menteng", R.drawable.ic_launcher_background));
        listRecomended.add(new RecomendedModel("Lapang 10", "Lapangan Badminton Kebayoran Baru", R.drawable.ic_launcher_background));
        adapter.setData(listRecomended);
    }
}