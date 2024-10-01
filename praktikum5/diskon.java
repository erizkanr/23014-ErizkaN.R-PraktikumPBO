/*
import java.util.Scanner; * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum5;
import java.util.Scanner;
/**
 *
 * @author abdul rohim
 */
public class diskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Input total purchase
        System.out.print("Masukkan total pembelian (Rp): ");
        double totalPembelian = scanner.nextDouble();

        double potongan = 0;
        if (totalPembelian < 50000) {
            // 5% discount for purchases under Rp 50,000
            potongan = totalPembelian * 0.05;
        } else {
            // 20% discount for purchases Rp 50,000 or above
            potongan = totalPembelian * 0.2;
        }

        // Calculate total to be paid
        double totalBayar = totalPembelian - potongan;

        // Output the results
        System.out.println("Total pembelian Rp               = " + totalPembelian);
        System.out.println("Besarnya potongan Rp             = " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp  = " + totalBayar);
    }
}
