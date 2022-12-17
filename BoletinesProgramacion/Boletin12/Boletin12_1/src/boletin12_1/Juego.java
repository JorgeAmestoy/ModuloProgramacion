package boletin12_1;

import javax.swing.JOptionPane;

public class Juego {

    int numeroSecreto;
    int cantidadIntentos;
    int intento;
    String numeroAdivinado= "Has acertado";
    String numSecretoMenor = "Numero secreto es menor, vuelve a intentarlo";
    String numSecretoMayor = "Numero secreto es mayor, vuelve a intentarlo";
    //Método que pide un entero entre 1 y 50 y se valida con bucle do while
    public void pedirNumero() {
        
        do{
            numeroSecreto = pedirEntero();
            cantidadIntentos = pedirEntero2();
           
        
        }while (numeroSecreto <= 0 || numeroSecreto>=50);
        
        for (int i=1; i<=cantidadIntentos; i++){
            
            intento = pedirEntero3();
            if (intento == numeroSecreto){
                JOptionPane.showMessageDialog(null, numeroAdivinado);
                
                break;
            } else if (i<cantidadIntentos && intento>numeroSecreto){
                
                JOptionPane.showMessageDialog(null, numSecretoMenor);
            }else if (i<cantidadIntentos && intento<numeroSecreto){
                JOptionPane.showMessageDialog(null, numSecretoMayor);
                
            }else{
                      JOptionPane.showMessageDialog(null, "Game over");
            }
        
        }
        
            
        
        
        
            
    }



   

    public static int pedirEntero() {
 
        
       return Integer.parseInt(JOptionPane.showInputDialog("Jugador 1: Teclea número"));
    }

    public static int pedirEntero2(){
     return Integer.parseInt(JOptionPane.showInputDialog("Jugargor 1: Teclea número de intentos"));
    }
    
    public static int pedirEntero3(){
     return  Integer.parseInt(JOptionPane.showInputDialog("Jugador 2: Prueba"));
    }
}    


