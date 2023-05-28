package com.example.finprov1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finprov1.databinding.ActivityDetailpfBinding;
import com.example.finprov1.placefacility.Pfmodel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailPfActivity extends AppCompatActivity {

    ActivityDetailpfBinding binding;

    private GoogleMap map;
    private double LAT = -6.20201;
    private double LON = 106.78113;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailpfBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Pfmodel data = (Pfmodel) getIntent().getSerializableExtra("pfmodel");
        binding.imgLapangan.setImageResource(data.getGambar());
        binding.txtContactNamaLapangan.setText(data.getNamalapangan());
        binding.txtDeskripsiLapangan.setText(data.getDeskripsi());
        binding.txtOpenHourLapangan.setText(data.getOpenhour());
        binding.txtPriceLapangan.setText(data.getPrice());
        binding.txtContactNamaLapangan.setText(data.getNamaPenjual());
        binding.txtContactPhoneLapangan.setText(data.getPhonePenjual());
        binding.txtContactEmailLapangan.setText(data.getEmailPenjual());



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback(){
            @Override
            public void onMapReady(GoogleMap googleMap) {
                map = googleMap;

                LatLng latLng = new LatLng(LAT, LON);
                map.addMarker(new MarkerOptions().position(latLng).title("Marker in Binus"));
                map.moveCamera(CameraUpdateFactory.newLatLng(latLng));

            }
        });
    }
}