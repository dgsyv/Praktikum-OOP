/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;


/**
 *
 * @author Heru
 */
import bab6.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        permainan permainan; // Polimorfisme: referensi superclass

        System.out.println("=== Pilih Jenis Permainan ===");
        System.out.println("1. Selancar");
        System.out.println("2. Flaying Fox");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = input.nextInt();

        // Polimorfisme: instansiasi subclass ke referensi superclass
        if (pilihan == 1) {
            permainan = new selancar();
        } else if (pilihan == 2) {
            permainan = new flayingfox();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        permainan.setJumlah(jumlah); // dipanggil dari superclass
        System.out.println("\n--- Rincian ---");
        System.out.println(permainan.getInfoPermainan()); // method override di subclass
        System.out.println("Jumlah tiket: " + permainan.getJumlah());
        System.out.println("Total harga: Rp " + permainan.hitungHarga()); // polymorphic call
    }
}

