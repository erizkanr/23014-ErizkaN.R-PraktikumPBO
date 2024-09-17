/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3;

/**
 *
 * @author abdul rohim
 */
public class DemoKonversiSuhu {
    
    public static void main(String[] args) {
        // Membuat instance dari KonversiSuhu2
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        // Nilai suhu dalam Celcius
        double celcius = 25;
        // Nilai suhu dalam Fahrenheit
        double fahrenheit = 77;
        
        // Menggunakan metode dari KonversiSuhu
        System.out.println("Celcius ke Fahrenheit: " + konversi.celciusToFahrenheit(celcius) + " °F");
        System.out.println("Celcius ke Reamur: " + konversi.celciusToReamur(celcius) + " °R");
        
        // Menggunakan metode dari KonversiSuhu2
        System.out.println("Fahrenheit ke Reamur: " + konversi.fahrenheitToReamur(fahrenheit) + " °R");
    }
}
