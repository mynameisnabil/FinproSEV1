package com.example.finprov1.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class PfTransaksi {


    @Override
    public String toString() {
        return "Judul Lapang: " + judulLapang +
                ", Kota Lapang: " + kotaLapang +
                ", Harga Lapang: " + hargaLapang +
                ", Tanggal: " + date +
                ", Nama: " + name +
                ", Email: " + email;
    }


    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "date")
    public String date;


    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "phone")
    public String phone;

    @ColumnInfo(name = "address")
    public String address;

    @ColumnInfo(name = "uid")
    public int uid;

    @ColumnInfo(name = "judulLapang")
    public String judulLapang;

    @ColumnInfo(name = "hargaLapang")
    public String hargaLapang;

    @ColumnInfo(name = "kotaLapang")
    public String kotaLapang;
}
