package com.zendev.gelamaitiara.data;

public class Anggota {

//    private int gambar;
    private String idcx;
    private String nama;
    private String divisi;

    public Anggota(String idcx, String nama, String divisi) {
        this.idcx = idcx;
        this.nama = nama;
        this.divisi = divisi;

    }

    public String getIdcx() {
        return idcx;
    }

    public void setIdcx(String idcx) {
        this.idcx = idcx;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

//    public int getGambar() {
//        return gambar;
//    }
//
//    public void setGambar(int gambar) {
//        this.gambar = gambar;
//    }
}

