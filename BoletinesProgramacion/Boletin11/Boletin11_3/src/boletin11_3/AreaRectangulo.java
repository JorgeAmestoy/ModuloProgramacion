
package boletin11_3;

import javax.swing.JOptionPane;


public class AreaRectangulo {
    
    
    public void areaRect(){
        int base, altura, num, area;
        
        do{
            base=pedirEnteiro();
            altura=pedirEnteiro();
            
            
        }while((base<=0)&&(altura<=0));
        
        area = base*altura;
        JOptionPane.showMessageDialog(null, "area =" +area);
        
    }
    
    public static int pedirEnteiro(){
        
         return Integer.parseInt(JOptionPane.showInputDialog("Teclea dato"));
          
    }
    
  public static int pedirNumero(){
      
     return Integer.parseInt(JOptionPane.showInputDialog("teclea"));
  }
    
}
