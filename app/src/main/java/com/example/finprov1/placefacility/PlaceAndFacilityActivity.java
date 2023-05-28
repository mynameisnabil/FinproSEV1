package com.example.finprov1.placefacility;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityLoginBinding;
import com.example.finprov1.databinding.ActivityPlaceAndFacilityBinding;
import com.example.finprov1.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class PlaceAndFacilityActivity extends AppCompatActivity {

    ActivityPlaceAndFacilityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlaceAndFacilityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Pfadapter pfadapter = new Pfadapter();
        binding.rvPvItem.setAdapter(pfadapter);
        binding.rvPvItem.setLayoutManager(new LinearLayoutManager(this));

        List<Pfmodel> pfmodelList  = new ArrayList<>();
        pfmodelList.add(new Pfmodel("Lapangan 1", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","Jam 10", "Rp. 100.000", "Joses", "08123456789", "joses@gmail.com", R.drawable.lapang1));

        pfadapter.setData(pfmodelList);
    }
}