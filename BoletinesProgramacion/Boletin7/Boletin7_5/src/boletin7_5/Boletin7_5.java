
package boletin7_5;

import java.util.Scanner;


public class Boletin7_5 {

    
    public static void main(String[] args) {
        
         Scanner obxScanner = new Scanner (System.in);
        System.out.println("Teclea n1");
        int num1 = obxScanner.nextInt();
        
        Scanner obxScanner2 = new Scanner (System.in);
         System.out.println("Teclea n2");
        int num2 = obxScanner.nextInt();
        Scanner obxScanner3 = new Scanner (System.in);
         System.out.println("Teclea n3");
        int num3 = obxScanner.nextInt();
        
       Numeros obxNumero = new Numeros();
       obxNumero.Numeros(num1, num2, num3);
        
    }
    
}
