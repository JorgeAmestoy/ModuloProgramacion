
package boletin6_3;


public class Boletin6_3 {

   
    public static void main(String[] args) {
          /*en el paremtrizado pongo los datos diretamente en el objetinsta instanciado new
        y como es publico me ahorro el set y el get. Si uso el defecto y quiero darle valores,
        al ser vacio, cero, tengo que usar set y gets para poder acceder a los atirbutos
        y luego darles el valor
        */
        Circulo obxCirculo = new Circulo();
        obxCirculo.setRadio(5);
        obxCirculo.areaCirculo();
        double resultado = obxCirculo.areaCirculo();
        System.out.println("Area do circulo = " +resultado);
        obxCirculo.lonxitudeCirculo();
        double resultado2 = obxCirculo.lonxitudeCirculo();
        System.out.println("Lonxitude = " +resultado2);
                
        
        
    }
    
}
