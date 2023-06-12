package com.example.finprov1.community;

import java.io.Serializable;

public class CommunityModel implements Serializable{

    private String nameCommunity, deskripsi, kota, openhour, price, namaContactCommunity, phoneCommunity, emailCommunity;

    private double latitude, longitude;

    private int gambar;

    public CommunityModel(String nameCommunity, String deskripsi, String kota, String openhour, String price, String namaContactCommunity, String phoneCommunity, String emailCommunity, int gambar, double latitude, double longitude) {
        this.nameCommunity = nameCommunity;
        this.deskripsi = deskripsi;
        this.kota = kota;
        this.openhour = openhour;
        this.price = price;
        this.namaContactCommunity = namaContactCommunity;
        this.phoneCommunity = phoneCommunity;
        this.emailCommunity = emailCommunity;
        this.gambar = gambar;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNameCommunity() {
        return nameCommunity;
    }

    public void setNameCommunity(String nameCommunity) {
        this.nameCommunity = nameCommunity;
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

    public String getNamaContactCommunity() {
        return namaContactCommunity;
    }

    public void setNamaContactCommunity(String namaContactCommunity) {
        this.namaContactCommunity = namaContactCommunity;
    }

    public String getPhoneCommunity() {
        return phoneCommunity;
    }

    public void setPhoneCommunity(String phoneCommunity) {
        this.phoneCommunity = phoneCommunity;
    }

    public String getEmailCommunity() {
        return emailCommunity;
    }

    public void setEmailCommunity(String emailCommunity) {
        this.emailCommunity = emailCommunity;
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
