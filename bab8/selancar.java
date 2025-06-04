/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab8;

import bab6.*;
import Bab3.*;

/**
 *
 * @author Heru
 */
public class selancar extends permainan {
private  int harga = 100000;

    @Override
    public int hitungHarga() {
        return harga * getJumlah();
    }

    @Override
    public String getInfoPermainan() {
        return "Permainan Selancar: pengalaman berselancar di atas ombak buatan.";
    }
    
}
