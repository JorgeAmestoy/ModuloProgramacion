package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        float billetes100, billetes20, billetes5, monedasDeUnEuro;

        Scanner obxBilletes = new Scanner(System.in);
        System.out.println("Teclea cantidad de billetes de 100");
        billetes100 = obxBilletes.nextFloat();
        System.out.println("Teclea cantidad de billetes de 20"); 
        billetes20 = obxBilletes.nextFloat();
        System.out.println("Teclea cantidaadmde  billetes de 5");
        billetes5 = obxBilletes.nextFloat();
        System.out.println("Teclea cantidad de monedas de un euro");
        monedasDeUnEuro = obxBilletes.nextFloat();

        float euros = (billetes100 * 100) + (billetes20 * 20) + (billetes5 * 5) + (monedasDeUnEuro);

        System.out.println(+billetes100 + " Billetes de 100 + " + billetes20 + " Billetes de 20  +" + billetes5 + " billetes de 5 +" + monedasDeUnEuro + "monedas de un euro son = " + euros+ " euros");

    }

}
