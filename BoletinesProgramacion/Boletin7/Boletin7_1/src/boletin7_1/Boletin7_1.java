package boletin7_1;

import javax.swing.JOptionPane;

public class Boletin7_1 {

    public static void main(String[] args) {

        Numero obxNumero = new Numero();
       
        String respuesta = JOptionPane.showInputDialog("Teclea número");
        double respuesta1 = Integer.parseInt(respuesta);
        obxNumero.numeroPositivo(respuesta1);
    }

}
