package boletin11_2;

import javax.swing.JOptionPane;

public class NumerosComp {

    public void numerosFor() {

        int num, suma=0, producto=1;

        for (int i = 11; i < 89; i++) {
            num = pedirEnteiro();
            suma = suma +num;
            producto= producto*num;
            
            
      
        }
        
        JOptionPane.showConfirmDialog(null, "resultado es " +suma+ "producto es" +producto);
    }
    
    public static int pedirEnteiro(){
        
         return Integer.parseInt(JOptionPane.showInputDialog("Teclea numero"));

    }

}
