package com.example.finprov1.training;

import java.io.Serializable;

public class TrainingModel implements Serializable {

        private String nameTraining, deskripsi, kota, openhour, price, namaContactTraining, phoneTraining, emailTraining;

        private double latitude, longitude;

        private int gambar;

        public TrainingModel(String nameTraining, String deskripsi, String kota, String openhour, String price, String namaContactTraining, String phoneTraining, String emailTraining, int gambar, double latitude, double longitude) {
            this.nameTraining = nameTraining;
            this.deskripsi = deskripsi;
            this.kota = kota;
            this.openhour = openhour;
            this.price = price;
            this.namaContactTraining = namaContactTraining;
            this.phoneTraining = phoneTraining;
            this.emailTraining = emailTraining;
            this.gambar = gambar;
            this.latitude = latitude;
            this.longitude = longitude;
        }

    public String getNameTraining() {
        return nameTraining;
    }

    public void setNameTraining(String nameTraining) {
        this.nameTraining = nameTraining;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
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

    public String getNamaContactTraining() {
        return namaContactTraining;
    }

    public void setNamaContactTraining(String namaContactTraining) {
        this.namaContactTraining = namaContactTraining;
    }

    public String getPhoneTraining() {
        return phoneTraining;
    }

    public void setPhoneTraining(String phoneTraining) {
        this.phoneTraining = phoneTraining;
    }

    public String getEmailTraining() {
        return emailTraining;
    }

    public void setEmailTraining(String emailTraining) {
        this.emailTraining = emailTraining;
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

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
