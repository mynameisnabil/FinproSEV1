package com.example.finprov1.training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityCommunityDetailBinding;
import com.example.finprov1.databinding.ActivityTrainingAndOnlineBinding;
import com.example.finprov1.databinding.ActivityTrainingAndOnlineDetailBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TrainingAndOnlineDetail extends AppCompatActivity {

    ActivityTrainingAndOnlineDetailBinding binding;

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrainingAndOnlineDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TrainingModel data = (TrainingModel) getIntent().getSerializableExtra("trainingmodel");
        binding.imgDetailTraining.setImageResource(data.getGambar());
        binding.txtNamaTraining.setText(data.getNameTraining());
        binding.txtDeskripsiTraining.setText(data.getDeskripsi());
        binding.txtOpenHourTraining.setText(data.getOpenhour());
        binding.txtPriceTraining.setText(data.getPrice());
        binding.txtContactNamaTraining.setText(data.getNamaContactTraining());
        binding.txtContactPhoneTraining.setText(data.getPhoneTraining());
        binding.txtContactEmailTraining.setText(data.getEmailTraining());

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