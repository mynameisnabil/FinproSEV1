package com.example.finprov1.turnament;

import java.io.Serializable;

public class TournamentModel implements Serializable {

    private String nameTournament, deskripsi, kota, openhour, price, namaContactTournamet, phoneTournamet, emailTournamet;

    private double latitude, longitude;

    private int gambar;


    public TournamentModel(String nameTournament, String deskripsi, String kota, String openhour, String price, String namaContactTournamet, String phoneTournamet, String emailTournamet, int gambar, double latitude, double longitude) {
        this.nameTournament = nameTournament;
        this.deskripsi = deskripsi;
        this.kota = kota;
        this.openhour = openhour;
        this.price = price;
        this.namaContactTournamet = namaContactTournamet;
        this.phoneTournamet = phoneTournamet;
        this.emailTournamet = emailTournamet;
        this.gambar = gambar;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNameTournament() {
        return nameTournament;
    }

    public void setNameTournament(String nameTournament) {
        this.nameTournament = nameTournament;
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

    public String getNamaContactTournamet() {
        return namaContactTournamet;
    }

    public void setNamaContactTournamet(String namaContactTournamet) {
        this.namaContactTournamet = namaContactTournamet;
    }

    public String getPhoneTournamet() {
        return phoneTournamet;
    }

    public void setPhoneTournamet(String phoneTournamet) {
        this.phoneTournamet = phoneTournamet;
    }

    public String getEmailTournamet() {
        return emailTournamet;
    }

    public void setEmailTournamet(String emailTournamet) {
        this.emailTournamet = emailTournamet;
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
