package exemplobucles;

import javax.swing.JOptionPane;

public class BucleWhile {

    public void verNumero() {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("teclea numero positivo"));
        
        while(num>=0){
            System.out.println(num);
            num = Integer.parseInt(JOptionPane.showInputDialog("teclea numero positivo"));
           
        }
      
            System.out.println("salimos del bucle");
    }

}
