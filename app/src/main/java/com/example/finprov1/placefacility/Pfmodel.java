package com.example.finprov1.placefacility;

import java.io.Serializable;

public class Pfmodel implements Serializable {

    private String namalapangan, deskripsi, kota, openhour, price, namaPenjual, phonePenjual, emailPenjual;

    private double latitude, longitude;

     private int gambar;

        public Pfmodel(String namalapangan, String deskripsi, String kota, String openhour, String price, String namaPenjual, String phonePenjual, String emailPenjual, int gambar, double latitude, double longitude) {
            this.namalapangan = namalapangan;
            this.deskripsi = deskripsi;
            this.kota = kota;
            this.openhour = openhour;
            this.price = price;
            this.namaPenjual = namaPenjual;
            this.phonePenjual = phonePenjual;
            this.emailPenjual = emailPenjual;
            this.gambar = gambar;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }


    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNamalapangan() {
        return namalapangan;
    }

    public void setNamalapangan(String namalapangan) {
        this.namalapangan = namalapangan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getOpenhour() {
        return openhour;
    }

    public void setOpenhour(String openhour) {
        this.openhour = openhour;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getPhonePenjual() {
        return phonePenjual;
    }

    public void setPhonePenjual(String phonePenjual) {
        this.phonePenjual = phonePenjual;
    }

    public String getEmailPenjual() {
        return emailPenjual;
    }

    public void setEmailPenjual(String emailPenjual) {
        this.emailPenjual = emailPenjual;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
