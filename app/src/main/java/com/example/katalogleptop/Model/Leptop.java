package com.example.katalogleptop.Model;

public class Leptop {
    private String tipe;
    private String jenis;
    private String deskripsi;
    private int drawableRes;

    public Leptop(String tipe,String jenis, String deskripsi, int drawableRes) {

        this.tipe = tipe;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }


    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }

}
