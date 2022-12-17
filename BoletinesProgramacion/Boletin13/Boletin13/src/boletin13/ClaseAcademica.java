
package boletin13;

import com.amestoy.paquete2.ClasePersoal;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClaseAcademica {
    
    public static int  numReferencia = 2018;
    private String nome;
    private int nota;
    private ClasePersoal alum;
    
  
    
    public ClaseAcademica(){
        
        numReferencia++;
        
    }
    
    public ClaseAcademica(String nome, int nota, ClasePersoal alum){
        ClaseAcademica.numReferencia ++;
        this.nota = nota;
        this.nome = nome;   
        this.alum = alum;
      
               
    }  
    
    public int pedirNota(){
     
        
        do{
            nota = pedirEnteiro();
         
           
            
    } while((nota<0) || (nota>10));
        JOptionPane.showMessageDialog(null, "nota =" +nota);
        return nota;
        
                 
    
            
        
    }
    
    public static int pedirEnteiro(){
        Scanner sc = new Scanner (System.in);
        return sc.nextInt();
        
    }
    
    
    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        ClaseAcademica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public ClasePersoal getAlum() {
        return alum;
    }

    public void setAlum(ClasePersoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "ClaseAcademica{" + "nome=" + nome + ", nota=" + nota + alum + '}';
    }

    int pedirNota(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
 

    
    
    
    
    
    
    
    
    
}
