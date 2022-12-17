package boletin11_1;

import javax.swing.JOptionPane;

public class Numeros {

    public void numFor() {
        int num, pos = 0, neg = 0, cero = 0;

        for (int i = 0; i < 10; i++) {
                 num = pedirEnteiro();
            if (num > 0) {
                pos = pos + 1;
            } else if (num < 0) {
                neg = neg + 1;
            } else {
                cero = cero + 1;
            }

          
            JOptionPane.showMessageDialog(null, "positivos :" + pos + "negativos :" + neg + "ceros :" + cero);
        }

    }

    public static int pedirEnteiro() {
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea numero"));

    }

}
