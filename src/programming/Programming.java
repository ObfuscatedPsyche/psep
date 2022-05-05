/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programming;

/**
 *
 * @author user
 */


public class Programming {

    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    
    static double celsiusToKelvin(double celsius){
        return celsius + 273.15;
        
    }

    public static void main(String[] args) {
        if(args.length == 2){
        double smallest = Double.parseDouble(args[0]);
        double largest = Double.parseDouble(args[1]);

        for (double i = smallest; i <= largest; ++i) {
            System.out.print(i + " in fahrenheit = ");
            System.out.format("%.2f", celsiusToFahrenheit (i));
            System.out.println();
        }
        }
    }
}


