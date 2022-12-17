
package boletin8_6;

import javax.swing.JOptionPane;

public class Almacen {
    
    private int ventas;
    private String nombreArticulo;
    
    
    public void setVentas(int ventas){
        this.ventas=ventas;
    }
    public int getVentas(){
        return ventas;
    }
    public void setnombreArticulo(String nombreArticulo){
        this.nombreArticulo=nombreArticulo;
    }
    public String getnombreArticulo(){
        return nombreArticulo;
    }
    
    public String ventasAnuais(){
       nombreArticulo = JOptionPane.showInputDialog("Introduce nombre del articulo");
     ventas = Integer.parseInt( JOptionPane.showInputDialog("Escribe numero de ventas"));
       String tipo;
        if(ventas<=100)
            tipo = "baixo";
        
        else if(ventas>100 && ventas<=500)
           tipo = "medio";
        
        else if (ventas>500 && ventas<=1000)
              tipo = "alto";
        else
              tipo = "primera necesidad";
        
        return tipo;
        
               
    }
    
    
    
    
    
    
    
}
