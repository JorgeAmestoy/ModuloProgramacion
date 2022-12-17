
package boletin8_7;


public class Circulo {
    
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public double areaCirculo(){
        
        double area = Math.PI * Math.pow(radio, 2);
         return area;
    }
    
    
}
