package org.example;

public class PurchaseCharge extends Charge {

    private int quantidade;

    public PurchaseCharge(float valorBase) {
        super(valorBase);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float calcularValor() {
        return this.valorBase * this.quantidade * (1 - this.tier.percentualDesconto());
    }
}
