package boletin2_1;

public class Boletin2_1 {

 
    
    public static void main(String[] args) {
        //proxecto que calcule a area do triangulo

        byte base = 4, altura = 3, area;

        area = (byte)(base * altura/ 2);
        
        //casteo todo el parentesis porque es int ya que la division puede no dar numero entero, entonces casteo

        System.out.println("a area do triangulo e = " + area);

    }

}
