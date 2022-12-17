
package boletinextra2;


public class BoletinExtra2 {


    public static void main(String[] args) {
  
        Conta obx = new Conta("Jorge Amestoy","345678",0,1500);
        Conta obx2 = new Conta("La Beyonsebe","456789",0,5000);
        System.out.println("Saldo de la cuenta de " +obx.getNome()+"es de " +obx.getSaldo());
        System.out.println("Saldo de la cuenta de " +obx2.getNome()+"es de " +obx2.getSaldo());
        obx.transferencia(obx2, 500);
        System.out.println("Transferencia de 500 euros");
        
       
        
        
        
        
        
    }
    
}
