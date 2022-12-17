
package boletin15;

import javax.swing.JOptionPane;


public class Boletin15 {

  
    public static void main(String[] args) {
    
       // Pelicula peli= new Pelicula("aaa","eee","iiii","sfdsf","sfsf","sdsfsf");
       // System.out.println(peli.toString());
        
       // Disco disc = new Disco("sss","adsf","adsf","adsfsf","sflkf");
      //  System.out.println(disc.toString());
        
        Pelicula peli2 = new Pelicula();
        peli2.setActor(pedirDatos("Escribe nombre actor"));
        peli2.setActriz(pedirDatos("Escribe nombre actriz"));
        peli2.setAutor(pedirDatos("Escribe nombre autor"));
        peli2.setDuracion(pedirDatos("Escribe cuánto dura"));
        peli2.setFormato(pedirDatos("Escribe formato"));
        peli2.setTitulo(pedirDatos("Escribe el título"));
       JOptionPane.showMessageDialog(null, peli2.toString());
       
       
        Disco disc2 = new Disco();
        disc2.setAutor(pedirDatos("Escribe autor"));
       //Así sucesivamente como con película
        
        
        
    }
    
      public static String pedirDatos(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
    
    
    
}
