package com.example.finprov1.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityTrainingAndOnlineBinding;
import com.example.finprov1.turnament.TournamentAdapter;
import com.example.finprov1.turnament.TournamentModel;

import java.util.ArrayList;
import java.util.List;

public class TrainingAndOnlineActivity extends AppCompatActivity {

    ActivityTrainingAndOnlineBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrainingAndOnlineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TrainigAdapter adapter = new TrainigAdapter();
        binding.rvTraining.setAdapter(adapter);
        binding.rvTraining.setLayoutManager(new LinearLayoutManager(this));

        List<TrainingModel> listTraining = new ArrayList<>();
        listTraining.add(new TrainingModel("BINUS Basketball Court 1", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTraining.add(new TrainingModel("BINUS Basketball Court 2", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTraining.add(new TrainingModel("BINUS Basketball Court 3", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTraining.add(new TrainingModel("BINUS Basketball Court 4", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTraining.add(new TrainingModel("BINUS Basketball Court 5", "Jl. Kebon Jeruk Raya No.27, RT.1/RW.2, Kb. Jeruk, Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11530", "Jakarta","07.00-22.00", "Rp. 100.000", "Bima", "08123456789", "bima@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        adapter.setData(listTraining);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}