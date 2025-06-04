/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author Heru
 */
public class permainan {
    private int harga;
    private int jumlah;

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getJumlah() {
        return jumlah;
    }
    // Method overloading
    public int hitungHarga() {
        return harga * jumlah;
    }
    public int hitungHarga(int diskonPersen) {
        int total = harga * jumlah;
        int diskon = total * diskonPersen / 100;
        return total - diskon;
    }
    // Method yang bisa dioverride
    public String getInfoPermainan() {
        return "Ini adalah permainan umum";
    }
}

