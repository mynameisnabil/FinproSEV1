package com.example.finprov1.placefacility;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityPlaceAndFacilityBinding;

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
        pfmodelList.add(new Pfmodel("BINUS Basketball Court", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        pfmodelList.add(new Pfmodel("UPH Basketball Court", "Jl. Anggrek No.15, RT.3/RW.4, Slipi, Kec. Palmerah, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11480", "Jakarta","07.00-22.00", "Rp. 150.000", "Andi", "08234567890", "andi@gmail.com", R.drawable.basketlagi, -6.20201, 106.78113));
        pfmodelList.add(new Pfmodel("UNESA Tennis Court", "Jl. Kedoya Raya No.88, RT.2/RW.5, Kedoya Utara, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11520", "Jakarta","07.00-22.00", "Rp. 80.000", "Budi", "08345678901", "budi@gmail.com", R.drawable.tennis  , -6.20201, 106.78113));
        pfmodelList.add(new Pfmodel("SMK St. Louis Basketball Court", "Jl. S. Parman No.15, RT.1/RW.3, Grogol, Kec. Grogol petamburan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11460", "Jakarta","07.00-22.00", "Rp. 120.000", "Rina", "08456789012", "rina@gmail.com", R.drawable.championfutsal , -6.20201, 106.78113));
        pfmodelList.add(new Pfmodel("Gelora Bung Karno Lapangan B", "Jl. Tanjung Duren Barat No.5, RT.8/RW.3, Tj. Duren Sel., Kec. Grogol petamburan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11470", "Jakarta","07.00-22.00", "Rp. 90.000", "Sari", "08567890123", "sari@gmail.com", R.drawable.lapangbadmint, -6.20201,106.78113 ));
        pfadapter.setData(pfmodelList);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}