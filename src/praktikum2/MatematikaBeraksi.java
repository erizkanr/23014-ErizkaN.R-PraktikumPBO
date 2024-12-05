/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;

/**
 *
 * @author abdul rohim
 */
 public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        int a = 20;
        int b = 10;

        int hasilPertambahan = matematika.pertambahan(a, b);
        int hasilPengurangan = matematika.pengurangan(a, b);
        int hasilPerkalian = matematika.perkalian(a, b);
        int hasilPembagian = matematika.pembagian(21, 2);

        System.out.println("Pertambahan : " + a + " + " + b + " = " + hasilPertambahan);
        System.out.println("Pengurangan : " + b + " - " + 5 + " = " + hasilPengurangan);
        System.out.println("Perkalian : " + b + " * " + 3 + " = " + hasilPerkalian);
        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
    }
    
}
