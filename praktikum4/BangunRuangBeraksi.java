/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

/**
 *
 * @author abdul rohim
 */
public class BangunRuangBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Membuat objek balok
        BangunRuang balok = new Balok (3, 4, 5);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        
        // Membuat objek kubus
        BangunRuang kubus = new Kubus(3);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}