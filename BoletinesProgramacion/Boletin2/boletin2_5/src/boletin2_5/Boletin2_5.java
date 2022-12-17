
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {


    public static void main(String[] args) {
 
        Scanner obxMillas = new Scanner (System.in); //instanciar obxecto scanner
        System.out.println("Teclea millas : ");
        float millas = obxMillas.nextFloat();//leo/meto al objeto scanner
        
        float  numero = 1952;
        
        float cambio = millas*numero;
        
        System.out.println (+millas+ " millas son " +cambio+ " metros");
        
        
        
    }
    
}
