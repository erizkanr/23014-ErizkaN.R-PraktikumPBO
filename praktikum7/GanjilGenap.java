/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author abdul rohim
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Genap dari 0 hingga 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Ganjil dari 0 hingga 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}