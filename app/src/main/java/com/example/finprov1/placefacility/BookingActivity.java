package com.example.finprov1.placefacility;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.finprov1.database.AppDatabase;
import com.example.finprov1.database.PfTransaksi;
import com.example.finprov1.database.pfTransaksiDao;
import com.example.finprov1.databinding.ActivityBookingBinding;

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

        pfTransaksiDao pfTransaksiDao = AppDatabase.getInstance(this).pftransactionDao();

        binding.btnBookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PfTransaksi pfTransaksi = new PfTransaksi();

                String emailPembeli = binding.etEmailForm.getText().toString();
                String namePembeli = binding.etNameForm.getText().toString();
                String phonePembeli = binding.etPhoneForm.getText().toString();
                String datePembeli = binding.dateEdt.getText().toString();
                pfTransaksi.judulLapang = data.getNamalapangan();
                pfTransaksi.kotaLapang = data.getKota();
                pfTransaksi.hargaLapang = data.getPrice();
                pfTransaksi.email = emailPembeli;
                pfTransaksi.name = namePembeli;
                pfTransaksi.phone = phonePembeli;
                pfTransaksi.date = datePembeli;


                pfTransaksiDao.pfAddTransaksi(pfTransaksi);
                Log.d("BookingActivity", "Data transaksi: " + pfTransaksi.toString());



            }
        });
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
                datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });

    }
}