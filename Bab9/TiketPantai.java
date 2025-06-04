/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9;

/**
 *
 * @author Heru
 */
public class TiketPantai extends TiketDasar implements Tiket {

    public TiketPantai(String namaPantai, double hargaPerTiket) {
        super(namaPantai, hargaPerTiket);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Tiket Pantai ===");
        System.out.println("Nama Pantai  : " + namaTempat);
        System.out.println("Harga Tiket  : Rp " + hargaPerTiket);
    }

    @Override
    public double hitungTotalHarga(int jumlahTiket) {
        return hargaPerTiket * jumlahTiket;
    }
}
