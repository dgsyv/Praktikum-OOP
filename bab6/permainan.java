/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab6;

import Bab3.*;

/**
 *
 * @author Heru
 */
public abstract class permainan {
    private int jumlah;

    // Setter dan getter untuk enkapsulasi
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    // Method abstrak yang harus dioverride
    public abstract int hitungHarga();

    // Optional method untuk deskripsi
    public abstract String getInfoPermainan();
}

