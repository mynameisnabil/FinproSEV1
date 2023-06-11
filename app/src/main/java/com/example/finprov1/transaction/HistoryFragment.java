package com.example.finprov1.transaction;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.databinding.FragmentHistoryBinding;

public class HistoryFragment extends Fragment {

    FragmentHistoryBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHistoryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


//    buat intent dan put extra untuk mengirim data ke detail transactio


    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        PfTransactionAdapter adapter = new PfTransactionAdapter();
        binding.rvBaru.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rvBaru.setHasFixedSize(true);
        binding.rvBaru.setAdapter(adapter);

        pfTransactionDao pfTransactionDao = AppDatabase.getInstance(requireContext()).pftransactionDao();
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("sharedpref", MODE_PRIVATE);
        int uid = sharedPreferences.getInt("uid", 0);
        adapter.setData(pfTransactionDao.getAll(uid));

//        debug menggunakan log cek apakah data sudah ada apa tidak

       Log.d("cek", "onViewCreated: "+ pfTransactionDao.getAll(uid));


        adapter.notifyDataSetChanged();
    }




}