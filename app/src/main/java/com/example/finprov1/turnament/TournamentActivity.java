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
        listTournament.add(new TournamentModel("MPL ID Regular Season 11", "MPL ID Regular Season 11 is a professional Mobile Legends: Bang Bang tournament featuring top teams from Indonesia. The tournament showcases intense battles and strategic gameplay as teams compete for the championship title.", "Jakarta","07.00-22.00", "Rp. 120.000", "Alex", "08123896789", "alex@gmail.com", R.drawable.mpl, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("BINUS Valorant Tournament", "BINUS Valorant Tournament is a competitive esports event focused on the popular first-person shooter game, Valorant. Players from different teams will engage in fast-paced, tactical gameplay, utilizing unique abilities and teamwork to outsmart and outgun their opponents.", "Jakarta","07.00-22.00", "Rp. 80.000", "Yoss", "08112356789", "yoss@gmail.com", R.drawable.valobaru, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("UI Football Tournament", "UI Football Tournament is an exciting football competition organized by the University of Indonesia. Teams from various universities and colleges will participate in thrilling matches, showcasing their skills, teamwork, and passion for the sport.", "Jakarta","07.00-22.00", "Rp. 100.000", "vania", "08123456789", "vania@gmail.com", R.drawable.uifo, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("SMK St. Louis Basketball Court", "SMK St. Louis Basketball Court is a basketball tournament held at the SMK St. Louis school. It provides an opportunity for basketball enthusiasts from different schools to compete and showcase their talent on the court.", "Jakarta","07.00-22.00", "Rp. 130.000", "reza", "08123409789", "reza@gmail.com", R.drawable.lapangbinusasli, -6.20201, 106.78113));
        listTournament.add(new TournamentModel("PRASMUL Volley Tournament", "PRASMUL Volley Tournament is a competitive volleyball event hosted by Prasetiya Mulya University. Teams from different universities and clubs will showcase their skills, agility, and teamwork in intense volleyball matches, aiming to claim the championship title.", "Jakarta","07.00-22.00", "Rp. 70.000", "keyla", "08123456789", "keyla@gmail.com", R.drawable.prasmul, -6.20201, 106.78113));
        adapter.setData(listTournament);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}