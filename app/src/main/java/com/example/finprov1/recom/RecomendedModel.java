package com.example.finprov1.recom;

import java.io.Serializable;

public class RecomendedModel implements Serializable {

    private String judul, subjudul;

    private int gambar;

    public RecomendedModel(String judul, String subjudul, int gambar) {
        this.judul = judul;
        this.subjudul = subjudul;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
