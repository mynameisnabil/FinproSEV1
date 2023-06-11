package com.example.finprov1.transaction;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finprov1.R;
import com.example.finprov1.auth.User;
import com.example.finprov1.auth.UserDao;
import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.databinding.ActivityBookingBinding;
import com.example.finprov1.placefacility.Pfmodel;
import com.example.finprov1.placefacility.PlaceAndFacilityActivity;

import java.util.Calendar;

public class BookingActivity extends AppCompatActivity {

    ActivityBookingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Pfmodel data = (Pfmodel) getIntent().getSerializableExtra("pfmodel");

        setCalender(); // Panggil metode setCalender() di sini

        pfTransactionDao pfTransactionDao = AppDatabase.getInstance(this).pftransactionDao();

        binding.btnBookNow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                PfTransaction pfTransaction = new PfTransaction();

                SharedPreferences sharedPreferences = getSharedPreferences("sharedpref", MODE_PRIVATE);
                int uid = sharedPreferences.getInt("uid", 0);



                String emailPembeli = binding.etEmailForm.getText().toString();
                String namePembeli = binding.etNameForm.getText().toString();
                String phonePembeli = binding.etPhoneForm.getText().toString();
                String datePembeli = binding.dateEdt.getText().toString();
                String alamatPembeli = binding.etAddress.getText().toString();
                pfTransaction.gambar = data.getGambar();
                pfTransaction.judulLapang = data.getNamalapangan();
                pfTransaction.kotaLapang = data.getKota();
                pfTransaction.hargaLapang = data.getPrice();
                pfTransaction.email = emailPembeli;
                pfTransaction.name = namePembeli;
                pfTransaction.phone = phonePembeli;
                pfTransaction.address = alamatPembeli;
                pfTransaction.date = datePembeli;
                if (binding.checkBoxjam1.isChecked()) {
                    String jam1 = binding.txtjam1.getText().toString();
                    pfTransaction.jadwaljam1 = jam1;

                } else {
                    pfTransaction.jadwaljam1 = " ";
                }


                pfTransaction.uid = uid;



                AlertDialog.Builder builder = new AlertDialog.Builder(BookingActivity.this);
                builder.setTitle("Password Check");
                builder.setMessage("Masukkan Password Anda:");

                LayoutInflater inflater = LayoutInflater.from(BookingActivity.this);
                View vw = inflater.inflate(R.layout.your_edittext_layout, null);
                final EditText editText = vw.findViewById(R.id.your_edittext_id);

                builder.setView(vw);




                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        try {

                            pfTransactionDao.pfAddTransaksi(pfTransaction);
                            Log.d("BookingActivity", "Data transaksi berhasil disimpan: " + pfTransaction.toString());
                            Toast.makeText(BookingActivity.this, "Data transaksi berhasil disimpan", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(BookingActivity.this, PlaceAndFacilityActivity.class);
                            setResult(RESULT_OK, intent);
                            finish();
                        } catch (SQLiteException e) {
                            Log.e("BookingActivity", "Gagal menyimpan data transaksi: " + e.getMessage());
                            Toast.makeText(BookingActivity.this, "Gagal menyimpan data transaksi", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
                builder.show();



            }
        });
    }





    public void setJadwal() {

    }


    public void setCalender() {


        binding.dateEdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are getting
                // the instance of our calendar.
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                // on below line we are creating a variable for date picker dialog.
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        // on below line we are passing context.
                        BookingActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our edit text.
                                binding.dateEdt.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
//                datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });

    }
}