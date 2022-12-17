package boletin.pkg7_2;

import java.util.Scanner;

public class Boletin7_2 {

    public static void main(String[] args) {
        Scanner obxScanner = new Scanner(System.in);
        System.out.println("Teclea número 1");
        short num1 = obxScanner.nextShort();

        Scanner obxScanner2 = new Scanner(System.in);
        System.out.println("Teclea numero 2");
        short num2 = obxScanner2.nextShort();
        
        numeroShort obxNumero = new numeroShort();
        obxNumero.sumar(num1, num2);
    }

}

