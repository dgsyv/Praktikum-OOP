/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab1bab2;

/**
 *
 * @author Heru
 */
public class main {
    public static void main(String[] args) {
      // membuat objek
      TIKET karcispantai = new TIKET();
      karcispantai.nama = "Sendang Biru";
      karcispantai.harga = 10000;
      karcispantai.lokasi = "MALANG";
      karcispantai.buka();
      System.out.println("Nama pantai  : " + karcispantai.nama);
      System.out.println("Harga tiket  : " + karcispantai.harga);
      System.out.println("lokasi       : " + karcispantai.lokasi);
    }
}
