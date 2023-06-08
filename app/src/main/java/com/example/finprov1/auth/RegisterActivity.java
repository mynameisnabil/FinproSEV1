package com.example.finprov1.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Toast;

import com.example.finprov1.R;
import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        UserDao userDao = AppDatabase.getInstance(this).userDao();

        binding.tvGoToLogin.setOnClickListener(view -> {

            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);

            String fullText = "Don’t have account? Register";
            int startIndex = fullText.indexOf("Register");
            int endIndex = startIndex + "Register".length();

            SpannableString spannableString = new SpannableString(fullText);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.blue)), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            binding.tvGoToLogin.setText(spannableString);

        });

        String fullText = "Already have account? Login";
        int startIndex = fullText.indexOf("Login");
        int endIndex = startIndex + "Login".length();

        SpannableString spannableString = new SpannableString(fullText);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.blue)), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        binding.tvGoToLogin.setText(spannableString);

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean passed = true;
                String name = binding.etNameRegister.getText().toString();
                String email = binding.etEmailRegister.getText().toString();
                String password = binding.etPasswordRegister.getText().toString();
                String confirm = binding.etConfirmPasswordRegister.getText().toString();
                String phone = binding.etPhoneNumberRegister.getText().toString();

                if(name.isEmpty()) {
                    passed = false;
                    binding.etNameRegister.setError("Nama tidak boleh kosong");
                } else if(name.length() < 5) {
                    passed = false;
                    binding.etNameRegister.setError("Nama tidak boleh kurang dari 5 karakter");
                }

                if(email.isEmpty()) {
                    passed = false;
                    binding.etEmailRegister.setError("Email tidak boleh kosong");
                } else if(!email.endsWith(".com")) {
                    passed = false;
                    binding.etEmailRegister.setError("Email tidak valid");
                }

                if(password.isEmpty()) {
                    passed = false;
                    binding.etPasswordRegister.setError("Password tidak boleh kosong");
                } else if(password.length() < 8) {
                    passed = false;
                    binding.etPasswordRegister.setError("Password tidak boleh kurang dari 8 karakter");
                }

                if(confirm.isEmpty()) {
                    passed = false;
                    binding.etConfirmPasswordRegister.setError("Konfirmasi password tidak boleh kosong");
                } else if(!confirm.equals(password)) {
                    passed = false;
                    binding.etConfirmPasswordRegister.setError("Konfirmasi password tidak sama");
                }

                if(phone.isEmpty()) {
                    passed = false;
                    binding.etPhoneNumberRegister.setError("Nomor telepon tidak boleh kosong");
                } else if(phone.length() < 10) {
                    passed = false;
                    binding.etPhoneNumberRegister.setError("Nomor telepon tidak valid");
                }

                if(passed) {
                    User user = new User();
                    user.name = name;
                    user.email = email;
                    user.password = password;
                    user.confirm_password = confirm;
                    user.phone = phone;

                    User registerd = userDao.checkEmail(email);

                    if (registerd != null) {
                        Toast.makeText(RegisterActivity.this, "Email sudah terdaftar", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        userDao.register(user);
                        Toast.makeText(RegisterActivity.this, "Register Berhasil", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                     else {
                        Toast.makeText(RegisterActivity.this, "Registrasi gagal", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}