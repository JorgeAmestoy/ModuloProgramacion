
package boletin14;

import com.Amestoy.Partes.Cpu;
import com.Amestoy.Partes.Monitor;
import com.Amestoy.Partes.Teclado;


public class Ordenador {
    
    
    private Monitor mo;
    private Teclado tc;
    private Cpu pro;
    private float precio;
    
    public Ordenador (){
        
        
    }

    public Ordenador(Monitor mo, Teclado tc, Cpu pro, float precio) {
        this.mo = mo;
        this.tc = tc;
        this.pro = pro;
        this.precio = precio;
    }

    public Monitor getMo() {
        return mo;
    }

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    public Teclado getTc() {
        return tc;
    }

    public void setTc(Teclado tc) {
        this.tc = tc;
    }

    public Cpu getPro() {
        return pro;
    }

    public void setPro(Cpu pro) {
        this.pro = pro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "tiene un monitor " + mo + ", un teclado de marca " + tc + " ,un procesador " + pro + " y un precio de " + precio + " euros";
    }
    
    
    
    
    
    
    
    
}
