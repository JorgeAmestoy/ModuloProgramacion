
package boletin12_2;

import javax.swing.JOptionPane;


public class JuegoOrdenador {
    
    int numeroSecreto = (int) ((Math.random() * 50) + 1);
    int intento;
    String acertarNumSecreto = "Acertaste";
    String NumSecretoMoiLonxe = "Moi lonxe";
    String NumSecretoLonxe = "Lonxe";
    String NumSecretoPreto = "Preto";
    String NumSecretoMoiPreto = "Moi preto";
    String fin = "GAME OVER. El número era el: "+numeroSecreto;

    public void pedirNumero() {
        int i;
        i= Integer.parseInt(JOptionPane.showInputDialog("Teclea numero intentos"));
       
        for (i = 1; i <= i; i++) {
            intento = pedirEntero("Teclea y adivina el número");
          
            if (intento == numeroSecreto) {
                JOptionPane.showMessageDialog(null, acertarNumSecreto);
                break;
            }else if (i==3){
                JOptionPane.showMessageDialog(null, fin);
                break;
            } else if ((numeroSecreto-intento)>20) {
                JOptionPane.showMessageDialog(null, NumSecretoMoiLonxe);
            } else if ((numeroSecreto-intento)>=10 && ((numeroSecreto-intento)<=20)) {
                JOptionPane.showMessageDialog(null, NumSecretoLonxe);
               
            }else if ((numeroSecreto-intento)>10 && ((numeroSecreto-intento)<5)) {
                JOptionPane.showMessageDialog(null, NumSecretoPreto);
            }else if ((numeroSecreto-intento)<=5) {
                JOptionPane.showMessageDialog(null, NumSecretoMoiPreto);
            }

        }

    }

    public static int pedirEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    
    
}
