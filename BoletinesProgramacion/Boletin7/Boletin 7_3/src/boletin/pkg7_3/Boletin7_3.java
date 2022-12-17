
package boletin.pkg7_3;

import java.util.Scanner;


public class Boletin7_3 {

    
    public static void main(String[] args) {
       Scanner obxScanner = new Scanner (System.in);
        System.out.println("Teclea numero");
        int num = obxScanner.nextInt();
        
        Signo obxSigno = new Signo();
        obxSigno.verSigno(num);
       
        
    }
    
}
