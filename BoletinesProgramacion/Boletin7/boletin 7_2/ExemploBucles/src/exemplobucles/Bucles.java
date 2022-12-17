
package exemplobucles;

//Escribe un programa que sume 5 numeros enteiros pedidos x teclado

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bucles {
    
  public void conWhile(){
       int i=0, num, suma=0;
              
      while (i<5){
         num = pedirEnteiro();
         suma = suma+num;
         i++;               
       
       System.out.println("suma =" +suma);
       }
   }      
       
    public void conDoWhile(){
       int i=0, num, suma=0;
       do{
            
          num = verEnteiro();
           suma = suma+num;
            i++;
        }while (i<5);
       JOptionPane.showMessageDialog(null, "suma " +suma);   
        
   }   
       public void conFor(){
           int num, suma=0;
           for (int i=0; i<5; i++){
               num=verEnteiro();
               suma = suma + num;
                                      
               
           }
           JOptionPane.showMessageDialog(null, "suma "+suma);
           


       }
       
           
       
       
   
        public static int pedirEnteiro(){
          Scanner sc = new Scanner (System.in);
           return sc.nextInt();
        }
           
       
        public static int verEnteiro(){
           return Integer.parseInt(JOptionPane.showInputDialog("Teclea numero"));
            
        }
    
}
