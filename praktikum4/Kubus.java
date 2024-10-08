/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author abdul rohim
 */
public class Kubus extends BangunRuang {
    private double sisi;
    
    // Konstruktor
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
    
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}
