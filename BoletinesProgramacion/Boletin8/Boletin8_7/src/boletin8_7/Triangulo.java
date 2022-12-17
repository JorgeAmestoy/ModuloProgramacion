
package boletin8_7;


public class Triangulo {
    
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float areaTriangulo(){
        
        float area = (base*altura)/2;
        return area;
    }
    
    
}
