
package bolextra1_1;

import java.util.Scanner;

public class BolExtra1_1 {

   
    public static void main(String[] args) {
   
        Scanner obx = new Scanner(System.in);
        System.out.println("Escribe base imponible");
        float sol1= obx.nextFloat();
       System.out.println("Escribe IVE");
       float porcentaje = obx.nextFloat();
        float iva = ((sol1*porcentaje)/100);
        float total = sol1+iva;
        System.out.println("Resultado final = " +total);
        
        
        
        
        
        
        
        
    }
    
}
