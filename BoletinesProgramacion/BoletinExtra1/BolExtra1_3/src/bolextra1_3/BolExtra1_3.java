
package bolextra1_3;

import java.util.Scanner;


public class BolExtra1_3 {

    public static void main(String[] args) {
     
        float a;
        float b;
        float c;
        float x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce valor de a");
        a = sc.nextFloat();
        System.out.println("Introduce valor de b");
        b = sc.nextFloat();
        System.out.println("Introduce valor de c");
        c = sc.nextFloat();
        
        float x1 = (float) (((-b) + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a));
        System.out.println("Resultado da primeia operacion = " +x1);
          float x2 = (float) (((-b) - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a));
        System.out.println("Resultado da primeia operacion = " +x2);
        
        
        
        
        
        
        
    }
    
}
