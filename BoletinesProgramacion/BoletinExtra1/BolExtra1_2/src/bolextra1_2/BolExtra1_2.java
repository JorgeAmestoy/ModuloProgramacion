
package bolextra1_2;

import java.util.Scanner;


public class BolExtra1_2 {

   
    public static void main(String[] args) {
    
        float a, b, c, x;
     Scanner obxEcuacion = new Scanner (System.in);
     System.out.println("Teclea valor de a");
     a = obxEcuacion.nextFloat();
     System.out.println("Teclea valor de b");
     b = obxEcuacion.nextFloat();
     System.out.println("Teclea valor de c");
     c = obxEcuacion.nextFloat();
     System.out.println("Teclea valor de x");
     x = obxEcuacion.nextFloat();
     
     double y = a* (Math.pow(x, 2))+ b * x +c;
     
     System.out.println("Y = " +y);
        
        
        
    }
    
}
