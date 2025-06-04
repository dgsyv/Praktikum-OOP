/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9;

/**
 *
 * @author Heru
 */
public class TiketDasar {
    protected String namaTempat;
    protected double hargaPerTiket;

    public TiketDasar(String namaTempat, double hargaPerTiket) {
        this.namaTempat = namaTempat;
        this.hargaPerTiket = hargaPerTiket;
    }

    public void sambutan() {
        System.out.println("Selamat datang di sistem pembelian tiket!");
    }
}
