package boletin6_1;

public class Coche {

    private int velocidade;

    public Coche() {
        //no hace falta ponerlo, ya viene x defecto
        velocidade = 0;
    }

    public int getVelocidade (){
        return velocidade;
    }
    public void acelerar (int valor){
        velocidade =velocidade+valor;
    }
    public void frenar (int menos){
        velocidade =velocidade-menos;
        
    }
}
