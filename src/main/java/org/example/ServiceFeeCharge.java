package org.example;

public class ServiceFeeCharge extends Charge {

    public ServiceFeeCharge(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase;
    }
}
