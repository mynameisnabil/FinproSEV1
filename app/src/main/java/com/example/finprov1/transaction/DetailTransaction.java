package com.example.finprov1.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityDetailTransactionBinding;

public class DetailTransaction extends AppCompatActivity {

    ActivityDetailTransactionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailTransactionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PfTransaction data = (PfTransaction) getIntent().getSerializableExtra("pftransaction");
        binding.imgDetailTransaction.setImageResource(data.gambar);
        binding.txtNamaLapanganDetailTransaction.setText(data.judulLapang);
        binding.txtEmailOrangDetailTransaction.setText(data.email);
        binding.txtNamaOrangDetailTransaction.setText(data.name);
        binding.txtAlamatOrangDetailTransaction.setText(data.address);
        binding.txtTanggalDetailTransaction.setText(data.date);
        binding.txtJamDetailTransaction.setText(data.jadwaljam1);


        binding.btnDone.setOnClickListener(view -> {

            setResult(Activity.RESULT_OK);
            finish();
        });
    }
}
