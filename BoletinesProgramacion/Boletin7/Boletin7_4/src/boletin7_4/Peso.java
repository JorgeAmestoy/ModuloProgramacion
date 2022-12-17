
package boletin7_4;


public class Peso {
  
  private String nombre;
  private float peso;
  
  public Peso (){      
         
  }
  public Peso (String nombre, float peso){
      this.nombre= nombre;
      this.peso = peso;
      
  }
  
  public void setNombre(String nombre){
      this.nombre=nombre;
  }
    
    public String getNombre (){
        return nombre;
    }
    
    public void setPeso (float peso){
        this.peso=peso;
    }
    
    public float getPeso (){
        return peso;
    }
    
}
