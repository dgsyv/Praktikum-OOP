/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

import Bab3.*;

/**
 *
 * @author Heru
 */
public class selancar extends permainan {

    public selancar() {
        setHarga(100000);
    }

    @Override
    public int hitungHarga() {
        return getHarga() * getJumlah();
    }
}

