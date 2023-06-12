package com.example.finprov1;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.finprov1.auth.LoginActivity;
import com.example.finprov1.auth.User;
import com.example.finprov1.auth.UserDao;
import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;
    private UserDao userDao;
    private User currentUser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userDao = AppDatabase.getInstance(requireContext()).userDao();
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("sharedpref", MODE_PRIVATE);
        int uid = sharedPreferences.getInt("uid", 0);
        currentUser = userDao.getUser(uid);

        if (currentUser != null) {
            binding.etNameFormProfile.setText(currentUser.name);
            binding.etEmailFormProfile.setText(currentUser.email);
            binding.etPhoneFormProfile.setText(currentUser.phone);
            binding.etPasswordProfile.setText(currentUser.password);
        }

        binding.btnSaveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentUser != null) {
                    currentUser.name = binding.etNameFormProfile.getText().toString();
                    currentUser.email = binding.etEmailFormProfile.getText().toString();
                    currentUser.phone = binding.etPhoneFormProfile.getText().toString();
                    currentUser.password = binding.etPasswordProfile.getText().toString();
                    userDao.update(currentUser);
                    Toast.makeText(requireContext(), "Profile updated successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnLogoutProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                Toast.makeText(requireContext(), "Logout successfully", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(requireContext(), LoginActivity.class);
                startActivity(intent);

                requireActivity().finish();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}