package com.example.finprov1.turnament;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityTournametDetailBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TournametDetail extends AppCompatActivity {

    ActivityTournametDetailBinding binding;

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTournametDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TournamentModel data = (TournamentModel) getIntent().getSerializableExtra("tournamentmodel");
        binding.imgDetailTournamament.setImageResource(data.getGambar());
        binding.txtNamaTournament.setText(data.getNameTournament());
        binding.txtDeskripsiTournament.setText(data.getDeskripsi());
        binding.txtOpenHourTournament.setText(data.getOpenhour());
        binding.txtPriceTournament.setText(data.getPrice());
        binding.txtContactNamaTournament.setText(data.getNamaContactTournamet());
        binding.txtContactPhoneTournament.setText(data.getPhoneTournamet());
        binding.txtContactEmailTournament.setText(data.getEmailTournamet());



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback(){
            @Override
            public void onMapReady(GoogleMap googleMap) {
                map = googleMap;

                LatLng latLng = new LatLng(data.getLatitude(), data.getLongitude());
                map.addMarker(new MarkerOptions().position(latLng).title(""));
                map.moveCamera(CameraUpdateFactory.newLatLng(latLng));

            }
        });


    }
}