
package com.Amestoy.Partes;


public class Cpu {
    
    private int velocidad;
    
    public Cpu(){
        
    }

    public Cpu(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "de " + velocidad;
    }
    
    
}
