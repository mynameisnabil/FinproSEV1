package com.example.finprov1.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Toast;

import com.example.finprov1.MainActivity;
import com.example.finprov1.R;
import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.databinding.ActivityLoginBinding;
import com.example.finprov1.recommended.RecommendedModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        userDao = AppDatabase.getInstance(this).userDao();

        binding.tvGoToRegister.setOnClickListener(view -> {

            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);

            String fullText = "Don’t have account? Register";
            int startIndex = fullText.indexOf("Register");
            int endIndex = startIndex + "Register".length();

            SpannableString spannableString = new SpannableString(fullText);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.blue)), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            binding.tvGoToRegister.setText(spannableString);

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