
package boletin16;

public class Boletin16 {

  
    public static void main(String[] args) {
 
        Persoa per1 = new Persoa("Jorge","Amestoy","345678");
        Conta conta1 = new Conta(98765,per1);
        conta1.ingresar(0);
        conta1.retirar(0);
        
        ContaAforro conta2 = new ContaAforro(5,200,conta1.getNumConta(),per1);
        conta2.ingresar(0);
        conta2.retirar(0);
        conta2.actualizarSaldo();
        System.out.println(conta2.toString());
        
        
        
        
        
        
        
        
        
    }
    
}
