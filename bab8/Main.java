/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab8;


/**
 *
 * @author Heru
 */
import bab6.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        permainan permainan = null;

        try {
            System.out.println("=== Pilih Jenis Permainan ===");
            System.out.println("1. Selancar");
            System.out.println("2. Flaying Fox");
            System.out.print("Masukkan pilihan (1/2): ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                permainan = new selancar();
            } else if (pilihan == 2) {
                permainan = new flayingfox();
            } else {
                throw new IllegalArgumentException("Pilihan tidak valid. Silakan pilih 1 atau 2.");
            }

            System.out.print("Masukkan jumlah tiket: ");
            int jumlah = input.nextInt();

            if (jumlah < 1) {
                throw new IllegalArgumentException("Jumlah tiket harus lebih dari 0.");
            }

            permainan.setJumlah(jumlah);

            System.out.println("\n--- Rincian ---");
            System.out.println("Jumlah tiket: " + permainan.getJumlah());
            System.out.println("Total harga: Rp " + permainan.hitungHarga());

        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka. Program dihentikan.");
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan tidak terduga: " + e.getMessage());
        } finally {
            input.close(); // pastikan Scanner ditutup
        }
    }
}

