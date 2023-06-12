package com.example.finprov1.turnament;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityTournamentBinding;
import com.example.finprov1.placefacility.Pfmodel;

import java.util.ArrayList;
import java.util.List;

public class TournamentActivity extends AppCompatActivity {


    ActivityTournamentBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTournamentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TournamentAdapter adapter = new TournamentAdapter();
        binding.rvTournament.setAdapter(adapter);
        binding.rvTournament.setLayoutManager(new LinearLayoutManager(this));

        List<TournamentModel> listTournament = new ArrayList<>();
        listTournament.add(new TournamentModel("BINUS Basketball Court 1", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("BINUS Basketball Court 2", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("BINUS Basketball Court 3", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("BINUS Basketball Court 4", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("BINUS Basketball Court 5", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        adapter.setData(listTournament);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}