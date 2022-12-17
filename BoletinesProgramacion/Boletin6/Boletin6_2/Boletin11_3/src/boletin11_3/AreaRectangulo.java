
package boletin11_3;

import javax.swing.JOptionPane;


public class AreaRectangulo {
    
    
    public void areaRect(){
        int base, altura, num, area;
        
        do{
            base=pedirEnteiro();
            altura=pedirEnteiro();
            area = base*altura;
            
        }while((base>0)&&(altura>0));
        
        JOptionPane.showMessageDialog(null, "area =" +area);
        
    }
    
    public static int pedirEnteiro(){
        
         return Integer.parseInt(JOptionPane.showInputDialog("Teclea base"));
        
    }
    
    
}
