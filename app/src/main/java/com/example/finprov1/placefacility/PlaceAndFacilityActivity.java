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
        pfmodelList.add(new Pfmodel("Lapangan 2", "Jl. Anggrek No.15, RT.3/RW.4, Slipi, Kec. Palmerah, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11480", "Jakarta","Jam 11", "Rp. 150.000", "Andi", "08234567890", "andi@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 3", "Jl. Kedoya Raya No.88, RT.2/RW.5, Kedoya Utara, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11520", "Jakarta","Jam 09", "Rp. 80.000", "Budi", "08345678901", "budi@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 4", "Jl. S. Parman No.15, RT.1/RW.3, Grogol, Kec. Grogol petamburan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11460", "Jakarta","Jam 12", "Rp. 120.000", "Rina", "08456789012", "rina@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 5", "Jl. Tanjung Duren Barat No.5, RT.8/RW.3, Tj. Duren Sel., Kec. Grogol petamburan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11470", "Jakarta","Jam 15", "Rp. 90.000", "Sari", "08567890123", "sari@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 6", "Jl. Tomang Raya No.12, RT.1/RW.2, Tomang, Kec. Grogol petamburan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11440", "Jakarta","Jam 16", "Rp. 130.000", "Ahmad", "08678901234", "ahmad@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 7", "Jl. Kedoya Raya No.22, RT.2/RW.4, Kedoya Utara, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11520", "Jakarta","Jam 17", "Rp. 110.000", "Toni", "08789012345", "toni@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 8", "Jl. Arjuna Utara No.18, RT.2/RW.3, Kemanggisan, Kec. Palmerah, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11480", "Jakarta","Jam 14", "Rp. 95.000", "Diana", "08890123456", "diana@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 9", "Jl. Meruya Ilir Raya No.36, RT.5/RW.8, Meruya Utara, Kec. Kembangan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11620", "Jakarta","Jam 13", "Rp. 140.000", "Rizki", "08901234567", "rizki@gmail.com", R.drawable.lapang1));
        pfmodelList.add(new Pfmodel("Lapangan 10", "Jl. Taman Sari Raya No.42, RT.3/RW.5, Taman Sari, Kec. Taman Sari, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11150", "Jakarta","Jam 18", "Rp. 160.000", "Wulan", "09012345678", "wulan@gmail.com", R.drawable.lapang1));

        pfadapter.setData(pfmodelList);
    }
}