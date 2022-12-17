
package boletin16;


public class ContaCorriente extends Conta{
    
    final static double INTERES = 1.5;

    public ContaCorriente() {
    }

    public ContaCorriente(long numConta, Persoa cliente) {
        super(numConta, cliente);
    }

  public void actualizarSaldo(){
      
   super.setSaldo(super.getSaldo()+(super.getSaldo()*(INTERES/100)));
   
  }

    @Override
    public String toString() {
        return super.toString()+" Interes da conta corrente = " +INTERES+ "%";
    }
    
    
    
    
    
}
