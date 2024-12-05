/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3;

/**
 *
 * @author abdul rohim
 */
public class MatematikaInheritance {
    
    public static void main(String[] args) {
        // Membuat instance dari Matematika2
        Matematika2 matematika = new Matematika2();
        
        // Memanggil metode dari class Matematika (inheritance)
        System.out.println("Pertambahan: " + matematika.pertambahan(10, 5));
        System.out.println("Pengurangan: " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian: " + matematika.perkalian(10, 5));
        System.out.println("Pembagian: " + matematika.pembagian(10, 5));
        
        // Memanggil metode dari class Matematika2 (tambahan)
        System.out.println("Modulus: " + matematika.modulus(10, 5));
    }
}