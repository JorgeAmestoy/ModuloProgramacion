
package boletin14;

import com.Amestoy.Partes.Cpu;
import com.Amestoy.Partes.Monitor;
import com.Amestoy.Partes.Teclado;


public class Boletin14 {


    public static void main(String[] args) {
        
        Ordenador obx1 = new Ordenador (new Monitor(21.4f), new Teclado ("Asus"), new Cpu (240), 600.50f);
        System.out.println("As caracteristicas do ordenador son " +obx1.toString());
        
      /** obx1.getPrecio();
        System.out.println("El precio del pc es " +obx1.getPrecio());
        
        System.out.println("teclado esss " +obx1.getTc().getMarca());
       
        Teclado obx2 = new Teclado("Intel");
        
        System.out.println("La marca del teclado es " + obx1.getTc());
        System.out.println("La marca es " +obx2.getMarca());
        
        Monitor obx3 = new Monitor(19) ;
        System.out.println("mopnitor tiene =" +obx3.getPulgadas());
        Teclado obx4 = new Teclado ();
      
        Cpu obx5 = new Cpu();
        
       **/
        
    }
    
}
