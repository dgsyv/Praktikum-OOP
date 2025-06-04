/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9;

/**
 *
 * @author Heru
 */
public class Main {
    public static void main(String[] args) {
        TiketPantai tiket = new TiketPantai("Pantai Pandawa", 20000);

        tiket.sambutan(); // metode dari superclass
        tiket.tampilkanInfo(); // metode dari interface

        int jumlahTiket = 4;
        double total = tiket.hitungTotalHarga(jumlahTiket);

        System.out.println("Jumlah Tiket : " + jumlahTiket);
        System.out.println("Total Harga  : Rp " + total);
    }
}
