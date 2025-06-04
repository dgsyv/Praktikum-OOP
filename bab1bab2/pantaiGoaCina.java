/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab1bab2;

/**
 *
 * @author Heru
 */
class PantaiGoaCina {
    public int jumlah;
    public double discount,total,harga;
 
    // Constructor
    public PantaiGoaCina(int jumlah, double harga, double discount) {
        this.jumlah = jumlah;
        this.harga = harga;
        this.discount = discount;
        this.total = hitungTotal();
    }

    // Method untuk menghitung total harga setelah diskon
    public double hitungTotal() {
        double subtotal = jumlah * harga;
        double potongan = subtotal * (discount / 100);
        return subtotal - potongan;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Harga per Tiket: Rp " + harga);
        System.out.println("Diskon: " + discount + "%");
        System.out.println("Total Bayar: Rp " + total);
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        PantaiGoaCina tiket = new PantaiGoaCina(3, 50000, 10);
        tiket.tampilkanInfo();
    }
}


