/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author abdul rohim
 */
public class PrimaDanBukanPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Prima dari 0 hingga 20:");
        for (int i = 2; i <= 20; i++) {
            if (apakahPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan Bukan Prima dari 0 hingga 20:");
        for (int i = 0; i <= 20; i++) {
            if (!apakahPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean apakahPrima(int angka) {
        if (angka < 2) return false;
        for (int i = 2; i <= angka / 2; i++) {
            if (angka % i == 0) return false;
        }
        return true;
    }
}