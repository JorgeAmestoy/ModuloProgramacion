
package boletin11_4;

import javax.swing.JOptionPane;


public class Tabla {
    
    private int num;
    private int resultado;
    private int i;
    
    
    public void tabla(){
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Teclea número"));
        if(num>0){
            
            for(i=1;i<10;i++){          
                   
         resultado = num*i;       
            System.out.println(i+ "*" +num+ "= " +resultado);
        
         
        }       
      
         
        }else
            System.out.println("La tabla es " +resultado);  
        

        
    }
    
    
    
    
}
