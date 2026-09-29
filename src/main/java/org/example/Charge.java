package org.example;

public abstract class Charge {

    protected LoyaltyTier tier;

    protected float valorBase;

    public Charge(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setTier(LoyaltyTier tier) {
        this.tier = tier;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();
}
