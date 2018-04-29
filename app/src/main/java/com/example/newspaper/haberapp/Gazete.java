package com.example.sebnem.haberapp;

/**
 * Created by sebnem on 11.06.2017.
 */

public class Gazete {
    private String g_isim;
    public Gazete(String g_isim){
        super();
        this.g_isim = g_isim;
    }

    @Override
    public String toString() {
        return g_isim;
    }

    public String getG_isim() {
        return g_isim;
    }

    public void setG_isim(String g_isim) {
        this.g_isim = g_isim;
    }
}
