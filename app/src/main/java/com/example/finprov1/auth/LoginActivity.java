package com.example.finprov1.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.finprov1.MainActivity;
import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.databinding.ActivityLoginBinding;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        UserDao userDao = AppDatabase.getInstance(this).userDao();

        binding.tvRegister.setOnClickListener(view -> {

            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);

        });

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean passed = true;

                String email = binding.etEmailLogin.getText().toString();
                String password = binding.etPasswordLogin.getText().toString();

                if (email.isEmpty()) {
                    binding.etEmailLogin.setError("Email tidak boleh kosong");
                } else if (!email.endsWith(".com")) {
                    binding.etEmailLogin.setError("Email tidak valid");
                }

                if (password.isEmpty()) {
                    binding.etPasswordLogin.setError("Password tidak boleh kosong");
                } else if (password.length() < 8) {
                    binding.etPasswordLogin.setError("Password tidak boleh kurang dari 8 karakter");
                }

                if (passed) {
                    User user = userDao.login(email, password);
                    if (user != null) {
                        SharedPreferences sharedPreferences = getSharedPreferences("sharedpref", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putInt("uid", user.uid);
                        editor.apply();

                        Toast.makeText(LoginActivity.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));

                    } else {
                        Toast.makeText(LoginActivity.this, "User Tidak Ditemukan", Toast.LENGTH_SHORT).show();

                    }

                }


            }
        });


    }
}