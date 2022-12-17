/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int euros, billetes100, billetes20, billetes10, billetes5, monedasDeUnEuro;
        
        Scanner obxDinero = new Scanner(System.in);
        
        System.out.println("Teclea euros ");
        euros = obxDinero.nextInt();
        billetes100 = euros / 100;
        billetes20 = (euros % 100) / 20;
        billetes5 = ((euros % 100) % 20) / 5;
        monedasDeUnEuro = (((euros % 100) % 20) % 5)/1;
        
        System.out.println(+euros + " euros son: \n" + billetes100 + " billetes de 100 \n"+ billetes20 + " billetes de 20 \n" + billetes5 + " billetes de 5 y \n" + monedasDeUnEuro + " monedasde un euro");
    }
    
}
