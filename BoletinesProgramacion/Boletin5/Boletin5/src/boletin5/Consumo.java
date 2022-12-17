
package boletin5;

public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo() {

    }

    public Consumo(float km1, float litros1, float vMed1, float pGas1) {

        km = km1;
        litros = litros1;
        vMed = vMed1;
        pGas = pGas1;
    }

    public void setKilometros(float km1) {
        km = km1;

    }

    public float getKilometros() {
        return km;
    }

    public void setLitros(float litros1) {
        litros = litros1;
    }

    public float getLitros() {
        return litros;
    }

    public void setVelocidad(float vMed1) {
        vMed = vMed1;
    }

    public float getVelocidad() {
        return vMed;
    }

    public void setGas(float pGas1) {
        pGas = pGas1;
    }

    public float getGas() {
        return pGas;
    }

    //no es un get, es una accion (enunciado)
    public float Tempo() {
        float tempo = km / vMed;
        return tempo;
    }

    public float consumoMedio() {
        float consumoVehiculo = (litros*100)/km;
        return consumoVehiculo;
    }

    public float consumoEuros() {
        float consumoEuros1 = (pGas*100)/km;
        return consumoEuros1;
    }
}
