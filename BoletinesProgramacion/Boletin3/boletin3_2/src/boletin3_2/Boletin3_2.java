
package boletin3_2;

import java.util.Scanner;


public class Boletin3_2 {

  //public static final float Fahrenheit = 1.8; (para hacer una constante).
    // entre public class y main
          
    public static void main(String[] args) {
        
     Scanner obxGrados = new Scanner (System.in);
     System.out.println ("Teclea grados : ");
     float grados = obxGrados.nextFloat();
     
     float Fahrenheit = (float) ((grados*1.8)+32);
     float Kelvin = (float) (grados + 273.15);
     System.out.println( +grados+ "ºC son " +Fahrenheit+ " grados Fahrenheit e " +Kelvin+ " grados Kelvin");
    
      
    }
    
}
