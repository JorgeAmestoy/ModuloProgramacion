
package boletin13;

import com.amestoy.paquete2.ClasePersoal;


public class Boletin13 {

   
    public static void main(String[] args) {
      
        ClasePersoal obx1 = new ClasePersoal("1111","aaaa");
        
        ClaseAcademica obx2 = new ClaseAcademica("aaa",7,obx1);
        System.out.println(obx2.toString());
        
        
        
    }
    
}
