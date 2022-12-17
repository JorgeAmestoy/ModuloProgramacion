
package boletin8_7;

import java.util.Scanner;

public class Boletin8_7 {

  
    public static void main(String[] args) {

        
        String eleccion = "Elige una figura geometrica";
        String elecOpcion1 = "1: Cuadrado";
        String elecOpcion2 = "2: Triangulo";
        String elecOpcion3 = "3: Circulo";
        String pedirLado = "Introduce lado";
        String pedirBase = "Introduce base";
        String pedirAltura = "Introduce altura";
        String pedirRadio = "Introduce radio";
        String areaCuadrado = "Area del cuadrado es: ";
        String areaTriangulo = "Area del triángulo es: ";
        String areaCirculo = "area del círculo es: ";
        String error = "Opcion incorrecta";


        System.out.println(eleccion);
        System.out.println(elecOpcion1);
        System.out.println(elecOpcion2);
        System.out.println(elecOpcion3);

        Scanner scaner = new Scanner(System.in);
        int figura = scaner.nextInt();

        switch (figura) {
            case 1:
                System.out.println(pedirLado);
                float lado = scaner.nextFloat();
                Cuadrado cuadrado1 = new Cuadrado();
                cuadrado1.setLado(lado);
                System.out.println(areaCuadrado + cuadrado1.areaCuadrado());
                break;
            case 2:
                System.out.println(pedirBase);
                float base = scaner.nextFloat();
                System.out.println(pedirAltura);
                float altura = scaner.nextFloat();
                Triangulo triangulo1 = new Triangulo();
                triangulo1.setBase(base);
                triangulo1.setAltura(altura);
                System.out.println(areaTriangulo + triangulo1.areaTriangulo());
                break;
            case 3:
                System.out.println(pedirRadio);
                float radio = scaner.nextFloat();
                Circulo circulo1 = new Circulo();
                circulo1.setRadio(radio);
                System.out.println(areaCirculo + circulo1.areaCirculo());
                break;
            default:
                System.out.println(error);
                break;
        
        
        }      
    }    
}        
        
        
    
    

