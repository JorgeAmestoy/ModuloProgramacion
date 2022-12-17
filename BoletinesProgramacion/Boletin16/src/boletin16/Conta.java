
package boletin16;

import javax.swing.JOptionPane;


public class Conta {
    
    private long numConta;
    private double saldo;
    private Persoa cliente;

    public Conta() {
    }

    public Conta(long numConta, Persoa cliente) {
        this.numConta = numConta;
        this.cliente = cliente;
    }

    public long getNumConta() {
        return numConta;
    }

    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

   
    
   public void ingresar(double ingreso){
       
       ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa diñeiro"));
       saldo = ingreso+ saldo;
       System.out.println("Ten" +saldo+ " euros");
       
   } 
   
   public void retirar(double retiro){
       
   //  saldo =  Integer.parseInt( JOptionPane.showInputDialog("Canto saldo tes?"));
       
       if (saldo>retiro){
           
         retiro= Integer.parseInt( JOptionPane.showInputDialog("Indica cantidade que desexa sacar"));
          saldo = saldo - retiro;
          System.out.println("Ha retirado " +retiro+ "e a sua conta queda con" +saldo+ "euros");
           
       }
           
        
       
   }

    @Override
    public String toString() {
        return "Conta{" + "numConta=" + numConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

    
   

    
    
    
    
    
    
    
    
}
