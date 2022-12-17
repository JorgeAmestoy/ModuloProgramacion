
package boletin6_1;


public class Boletin6_1 {

    public static void main(String[] args) {
                Coche obxCoche = new Coche();
                
                obxCoche.acelerar(50);
                System.out.println("Aceleración de: " +obxCoche.getVelocidade() );
                
               obxCoche.frenar(40);
                System.out.println("Diminucion de:" +obxCoche.getVelocidade());
               
    }
    
}
