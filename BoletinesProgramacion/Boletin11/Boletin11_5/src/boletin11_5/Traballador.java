
package boletin11_5;

import javax.swing.JOptionPane;

public class Traballador {
    
    private int soldo ;
    private int soldoMedio=0;
    private int soldoBaixo=0;
    private int traballadores=0;
    private float porcentaje=0;
    
    
    
    public void empresas(){
   
        
        do{
           soldo = Integer.parseInt(JOptionPane.showInputDialog("Teclea sueldo del trabajador"));
          
           if (soldo>0){
               traballadores++;
               if ((soldo>=1000)&&(soldo>=1750)){
                  soldoMedio = soldoMedio+1;
                   
                   
               }else if (soldo<1000){
                   
                  soldoBaixo = soldoBaixo+1;
                   
               }
               
           }
            
            
            
            
        }while (soldo!=0);
        
       porcentaje = soldoBaixo/traballadores*100;
        System.out.println("Trabajadores con sueldo entre 1000 y 1750 = " + soldoMedio);
        System.out.println("Trabajadores con sueldo menos de 1000 = " +soldoBaixo);
        System.out.println("Porcentaje de trabajadores con menos de 1000 euros = " + porcentaje);
        
        
        
    }
    
    
    
    
    
    
    
}
