/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author abdul rohim
 */
public class KonversiSuhu2 extends KonversiSuhu {
    
    public double fahrenheitToReamur(double fahrenheit) {
        // Pertama-tama konversi Fahrenheit ke Celcius
        double celcius = (fahrenheit - 32) * 5/9;
        // Kemudian konversi Celcius ke Reamur
        return celcius * 4/5;
    }
} 
