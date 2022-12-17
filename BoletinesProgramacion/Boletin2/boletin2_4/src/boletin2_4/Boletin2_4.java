
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {
    //calcular todas operaciones hasta division con sus resultados
   
   
    public static void main(String[] args) {
        
    Scanner obxOperaciones = new Scanner (System.in);
    
    System.out.println("Teclea Num1 : ");
    float Num1 = obxOperaciones.nextFloat();
    
    System.out.println ("Teclea Num2 : ");
    float Num2 = obxOperaciones.nextFloat();
    
    float suma = Num1 + Num2;
    float resta = Num1 - Num2;
    float multiplicacion = Num1 * Num2;
    float division = Num1/Num2;
            
    System.out.println ("suma = " +suma+ "\nresta= " +resta+ "\nmultiplicacion= " +multiplicacion+ "\ndivision= " +division);
    
            

    }
    
}
