/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author Heru
 */
public class Selancar extends permainan {
    public Selancar() {
        setHarga(100000);
    }
    @Override
    public int hitungHarga() {
        return getHarga() * getJumlah();
    }
    // Method overriding
    @Override
    public String getInfoPermainan() {
        return "Permainan Selancar di atas ombak buatan";
    }
    // Overloading tambahan di subclass
    public int hitungHarga(int diskonPersen, int tambahanBiaya) {
        int total = getHarga() * getJumlah();
        int diskon = total * diskonPersen / 100;
        return total - diskon + tambahanBiaya;
    }
}

