
package boletinextra2;

import javax.swing.JOptionPane;


public class Conta {
    
    private String nome;
    private String numConta;
    private double interese;
    private double saldo;
    
    public Conta(){
        
    }
    
    public Conta (String nome, String numConta, double interese, double saldo){
        
        this.nome=nome;
        this.numConta=numConta;
        this.interese=interese;
        this.saldo=saldo;
        
        
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getInterese() {
        return interese;
    }

    public void setInterese(double interese) {
        this.interese = interese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresoDinero(float ingreso){
        
     ingreso= Integer.parseInt( JOptionPane.showInputDialog("Indique cantidade a ingresar")); 
        
     saldo = ingreso + saldo;
     
        System.out.println("El saldo total es " +saldo);
     
     
    }
    
    public double reintegroDinero(double reintegro){
        
        do{
             reintegro= Integer.parseInt( JOptionPane.showInputDialog("Indique cantidade a sacar")); 
             saldo = saldo - reintegro;
             System.out.println("Tes " +saldo);
             
             
        }while(reintegro<0);
        return reintegro;
        
        
        
    }
    
    
    public void transferencia(Conta contaDestino, float importe){
        this.reintegroDinero(importe);
        contaDestino.ingresoDinero(importe);
        
        
    }
    
    
    
    
    
    
}
