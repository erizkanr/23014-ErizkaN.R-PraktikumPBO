/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author abdul rohim
 */
    public class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;
    
    // Konstruktor
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }
}
