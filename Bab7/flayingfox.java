/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;

import bab6.*;
import Bab3.*;

/**
 *
 * @author Heru
 */
public class flayingfox extends permainan {
    private int harga = 10000;

    @Override
    public int hitungHarga() {
        return harga * getJumlah();
    }

    @Override
    public String getInfoPermainan() {
        return "Permainan Flaying Fox: meluncur dari ketinggian melalui tali gantung.";
    }
}
