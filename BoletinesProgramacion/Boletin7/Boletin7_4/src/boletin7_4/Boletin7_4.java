
package boletin7_4;

import java.util.Scanner;

public class Boletin7_4 {

   
    public static void main(String[] args) {
        
        Scanner obxScanner = new Scanner (System.in);
          System.out.println("Teclea nombre");
       String nome = obxScanner.nextLine();
        System.out.println("Teclear peso");
        float peso = obxScanner.nextFloat();
       
       
        Peso obxPeso1 = new Peso();
        Peso obxPeso2 = new Peso();
        
        float diferencia = obxPeso1.getPeso() - obxPeso2.getPeso();
        
        if (obxPeso1.getPeso()>obxPeso2.getPeso())
            System.out.println("peso es" +obxPeso1.getPeso()+ "con una diferencia de" +diferencia );
        
        else if (obxPeso2.getPeso()> obxPeso1.getPeso())
            System.out.println("peso es " +obxPeso2.getPeso()+ "con una diferencia de " +(obxPeso2.getPeso()-obxPeso1.getPeso()));
                
                
        
        
   
        
    }
    
}
