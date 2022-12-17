
package boletin17;

import javax.swing.JOptionPane;

public class Notas {
    
    private float probaEscrita1;
    private float probaEscrita2;
    private float probaPractica;
    private float numboletins;
    private float numboletinsFeitos;
    private float notaBoletins;
    
    public float notaEscrita(){
   
           
      probaEscrita1 = validarNota("Ingresa nota primera proba escrita");
      probaEscrita2 =   validarNota("Ingresa nota segunda proba escrita");
      float resultadoEscrita = (probaEscrita1+probaEscrita2)/2*0.40f;
      System.out.println("Resultado da proba escrita" +resultadoEscrita);
         return resultadoEscrita;
    }
    
   /** public void notaPractica(){
        float resultado;
        do{
               probaPractica = Integer.parseInt(JOptionPane.showInputDialog("Ingresa nota da proba practica"));
               resultado = (probaPractica)*0.40f;
               break;
            
        }while(probaPractica>0 && probaPractica<10);
        
        System.out.println("Tes" +resultado+" puntos na practica");
        
        
    }
    **/
       
    public float notaPractica(){
        
        probaPractica = validarNota("Escribe nota de parte practica");
        float resultadoPractica = probaPractica*0.40f;
        System.out.println("Ten "+resultadoPractica+ " de nota practica");
        return resultadoPractica;
        
    }   
    
    
    public float notaBoletinss(){
      numboletins = Integer.parseInt( JOptionPane.showInputDialog("Ingresa numeros de boletins"));
      numboletinsFeitos =  Integer.parseInt( JOptionPane.showInputDialog("Ingresa numero de boletins que terminaches"));
      
      if(((numboletinsFeitos/numboletins)*100)>90){
          
          notaBoletins = 2;
          System.out.println("Tes 2 puntos");
          
          
      }else if(((numboletinsFeitos/numboletins)*100)>=70 && (((numboletinsFeitos/numboletins)*100)<=90)){
          
          notaBoletins = 1;
           System.out.println("Tes 1 puntos");
      }else{
          
          notaBoletins = 0;
           System.out.println("Tes 0 puntos");
      }
          return notaBoletins;
              
    }
    
    public void notaFinal(){
        
   float resultado = notaEscrita()+notaPractica()+notaBoletinss();
        System.out.println("A nota final es " +resultado);
        
        
        
    }
    
    
    public float validarNota(String mensaje){
        
        float nota;
        
        do{
          
           nota = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
            
          
           
        }while (nota<0 || nota > 10);
                
             return nota;  
       
   
        
      
    }
        
        
    
    

    
    
    
    
    
}
