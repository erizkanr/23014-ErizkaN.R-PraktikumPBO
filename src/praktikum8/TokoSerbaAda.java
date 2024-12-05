/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum8;
import java.util.Scanner;
/**
 *
 * @author abdul rohim
 */
public class TokoSerbaAda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Define arrays for item data
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};

        // Arrays to store user inputs
        String[] kodeBeli = new String[3];
        int[] jumlahBeli = new int[3];
        int[] totalBayarPerItem = new int[3];

        System.out.print("Masukkan Item Barang : ");
        int itemCount = scanner.nextInt();

        // Get input from user
        for (int i = 0; i < itemCount; i++) {
            System.out.println("\nData ke " + (i + 1));
            System.out.print("Masukkan Kode : ");
            kodeBeli[i] = scanner.next();
            System.out.print("Masukkan Jumlah Beli : ");
            jumlahBeli[i] = scanner.nextInt();
        }

        // Display header
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************************");
        System.out.printf("%-5s %-10s %-12s %-8s %-12s %-12s%n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");

        int grandTotal = 0;

        // Process each item
        for (int i = 0; i < itemCount; i++) {
            int index = -1;

            // Find the item by code
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equalsIgnoreCase(kodeBarang[j])) {
                    index = j;
                    break;
                }
            }

            // If item is found, calculate total and display
            if (index != -1) {
                int harga = hargaBarang[index];
                int jumlahBayar = harga * jumlahBeli[i];
                totalBayarPerItem[i] = jumlahBayar;

                System.out.printf("%-5d %-10s %-12s %-8d %-12d %-12d%n", (i + 1), kodeBarang[index], namaBarang[index], harga, jumlahBeli[i], jumlahBayar);
                grandTotal += jumlahBayar;
            }
        }

        // Display grand total
        System.out.println("====================================================");
        System.out.printf("Total Bayar %33d%n", grandTotal);
        System.out.println("====================================================");
    }
}