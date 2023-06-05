package com.example.finprov1;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.database.pfTransaksiDao;
import com.example.finprov1.databinding.FragmentHistoryBinding;
import com.example.finprov1.placefacility.pfTransaksiAdapter;

public class HistoryFragment extends Fragment {

    FragmentHistoryBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHistoryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pfTransaksiAdapter adapter = new pfTransaksiAdapter();
        binding.rvHistory.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.rvHistory.setAdapter(adapter);

        pfTransaksiDao pfTransaksiDao = AppDatabase.getInstance(requireContext()).pftransactionDao();
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("sharedpref", MODE_PRIVATE);
        int uid = sharedPreferences.getInt("uid", 0);
        adapter.setData(pfTransaksiDao.getAll(uid));
        adapter.notifyDataSetChanged();
        // Menambahkan pemanggilan ini
    }

}