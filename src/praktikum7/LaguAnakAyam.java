/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author abdul rohim
 */
public class LaguAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        // Jumlah awal anak ayam
        int jumlahAnakAyam = 6;

        // Bagian pertama lirik
        System.out.println("Anak ayam turun berkotek");
        System.out.println("Anak ayam turunlah " + jumlahAnakAyam);

        // Perulangan untuk mengurangi jumlah anak ayam hingga 1
        for (int i = jumlahAnakAyam; i > 0; i--) {
            if (i != jumlahAnakAyam) {
                System.out.println("Anak ayam turunlah " + i);
            }
            System.out.println("Pergi satu, tinggallah " + (i - 1));

            // Setiap kali jumlah anak ayam mencapai 4 dan 2, tampilkan "Tek-kotek-kotek-kotek"
            if (i == 4 || i == 2) {
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
            }
        }

        //Saat semua anak ayam hilang
        System.out.println("Anak ayam turunlah 1");
        System.out.println("Pergi satu hilang semua");
    }
}