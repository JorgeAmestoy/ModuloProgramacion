
package boletin16;


public class ContaAforro extends Conta{
    
    private float interes;
    private double saldoMinimo;

    public ContaAforro() {
    }

    public ContaAforro(float interes, double saldoMinimo, long numConta, Persoa cliente) {
        super(numConta, cliente);
        this.interes = interes;
        this.saldoMinimo = saldoMinimo;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    
    public void actualizarSaldo(){
        
        if (super.getSaldo()>=saldoMinimo){
            super.setSaldo(super.getSaldo()+(super.getSaldo()*(interes/100)));
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
