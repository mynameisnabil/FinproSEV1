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
        binding.rvRecom.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rvLatst.setAdapter(adapter);
        binding.rvLatst.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rvPopular.setAdapter(adapter);
        binding.rvPopular.setLayoutManager(new LinearLayoutManager(requireContext()));


        binding.btnPf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), PlaceAndFacilityActivity.class);
                startActivity(intent);
            }
        });


        List<RecomendedModel> listRecomended = new ArrayList<>();
        listRecomended.add(new RecomendedModel("Judul","SubJudul",R.drawable.ic_launcher_background));

        adapter.setData(listRecomended);
    }
}