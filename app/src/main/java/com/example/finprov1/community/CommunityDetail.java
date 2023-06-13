package com.example.finprov1.community;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityCommunityDetailBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CommunityDetail extends AppCompatActivity {

    ActivityCommunityDetailBinding binding;

    private GoogleMap map;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommunityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CommunityModel data = (CommunityModel) getIntent().getSerializableExtra("communitymodel");
        binding.imgDetailCommunity.setImageResource(data.getGambar());
        binding.txtNamaCommunity.setText(data.getNameCommunity());
        binding.txtDeskripsiCommunity.setText(data.getDeskripsi());
        binding.txtOpenHourCommunity.setText(data.getOpenhour());
        binding.txtPriceCommunity.setText(data.getPrice());
        binding.txtContactNamaCommunity.setText(data.getNamaContactCommunity());
        binding.txtContactPhoneCommunity.setText(data.getPhoneCommunity());
        binding.txtContactEmailCommunity.setText(data.getEmailCommunity());

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