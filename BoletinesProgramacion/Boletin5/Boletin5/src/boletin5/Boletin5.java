
package boletin5;

public class Boletin5 {

    public static void main(String[] args) {
     
         Consumo obxConsume = new Consumo();
        
        obxConsume.setLitros(50f);
        obxConsume.setGas(1.57f);
        
        Consumo obxConsumo1 = new Consumo (23.5f, 200f, 100, 1.80f );
        
      //float patata = obxConsumo.consumoMedio();
        
       System.out.println("Consumo medio: " +obxConsumo1.consumoMedio());
                
       obxConsumo1.setLitros(24f);
       
        System.out.println("Velocidade media: " +obxConsumo1.getVelocidad());
    }
    
}
