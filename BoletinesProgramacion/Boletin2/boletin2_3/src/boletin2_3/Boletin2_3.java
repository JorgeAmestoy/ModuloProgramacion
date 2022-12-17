package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        //Cambia euros a dolares
        Scanner obxScanner = new Scanner(System.in);
        System.out.println("Teclea euros :");
        float euros = obxScanner.nextFloat();

        System.out.println("Teclea valorDolar :");
        float valorDolar = obxScanner.nextFloat();

        float cambio = euros*valorDolar;
        System.out.println("o resultado e = " + cambio);

    }

}
