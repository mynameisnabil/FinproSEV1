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
        listTraining.add(new TrainingModel("Tutorial Kungfu Sampai Mahir", "Tutorial Kungfu Sampai Mahir adalah program pelatihan yang dirancang untuk mengajarkan keterampilan dan teknik kungfu kepada peserta. Program ini mencakup berbagai tingkatan, mulai dari pemula hingga mahir, dan memungkinkan peserta untuk mempelajari gerakan dasar, kekuatan, kelincahan, serta aplikasi praktis dari kungfu.", "Jakarta","07.00-22.00", "Rp. 100.000", "raihan", "08176556789", "raihan@gmail.com", R.drawable.kungfu, -6.20201, 106.78113));
        listTraining.add(new TrainingModel("Pelatihan Basket UPH", "Pelatihan Basket UPH adalah program pelatihan yang diselenggarakan oleh Universitas Pelita Harapan. Program ini dirancang untuk mengembangkan keterampilan bermain basket, seperti teknik dasar, strategi permainan, peningkatan kondisi fisik, serta kerja sama tim. Pelatihan ini terbuka bagi siapa saja yang memiliki minat dan antusiasme dalam mempelajari dan meningkatkan kemampuan bermain basket.", "Tanggerang","07.00-22.00", "Rp. 120.000", "Joses", "08123456787", "joses@gmail.com", R.drawable.uph, -6.20201, 106.78113));
        listTraining.add(new TrainingModel("Pelatihan Valorant untuk Umum", "Pelatihan Valorant untuk Umum adalah program pelatihan yang ditujukan bagi para penggemar game Valorant yang ingin meningkatkan kemampuan bermain mereka. Program ini akan memberikan pemahaman mendalam tentang mekanika permainan, strategi tim, komunikasi, dan keterampilan individu yang diperlukan untuk menjadi pemain Valorant yang kompetitif. Pelatihan ini terbuka untuk semua kalangan dan level keahlian.", "Jakarta","07.00-22.00", "Rp. 150.000", "adit", "08190756789", "adit@gmail.com", R.drawable.valobaru, -6.20201, 106.78113));
        listTraining.add(new TrainingModel("Pelatihan Sepak Bola Terbuka", "Pelatihan Sepak Bola Terbuka adalah program pelatihan yang ditawarkan kepada para pecinta sepak bola dari berbagai usia dan tingkat keahlian. Program ini memberikan kesempatan kepada peserta untuk meningkatkan keterampilan teknis seperti dribbling, passing, shooting, serta peningkatan kondisi fisik yang diperlukan dalam sepak bola. Pelatihan ini menciptakan lingkungan yang mendukung perkembangan individu dan mempromosikan semangat olahraga yang sehat.", "Jakarta","07.00-22.00", "Rp. 100.000", "ilyas", "08123459869", "ilyas@gmail.com", R.drawable.bolabaru, -6.20201, 106.78113));
        adapter.setData(listTraining);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}