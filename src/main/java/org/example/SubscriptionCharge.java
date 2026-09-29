package org.example;

public class SubscriptionCharge extends Charge {

    public SubscriptionCharge(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * (1 - this.tier.percentualDesconto());
    }

}
