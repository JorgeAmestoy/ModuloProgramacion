package boletin6_3;

public class Circulo {

    private double radio;
   private final static double PI = 3.14;

    public Circulo() {

    }

    public Circulo(double rad, double pi) {
        radio=rad;
      
    }
    
    public void setRadio (double rad){
        radio=rad;
        
    }
    public double getRadio(double rad){
        return radio;
    }

    //constantes no hace flata hacer set y get
    public void setPi (double pi){
        
    }
    public double getPi (double pi){
        return PI;
        
    }
    public double areaCirculo (){
       double area = PI*Math.pow(radio, 2);
       return area;
    }
    public double lonxitudeCirculo (){        
        return 2*PI*radio;
        //simplificado
    }
}
