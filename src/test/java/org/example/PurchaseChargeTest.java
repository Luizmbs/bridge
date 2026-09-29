package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseChargeTest {

    @Test
    void deveRetornarValorCompraComBronze() {
        LoyaltyTier tier = new BronzeTier();
        PurchaseCharge purchase = new PurchaseCharge(50.0f);
        purchase.setTier(tier);
        purchase.setQuantidade(2);
        assertEquals(100.0f, purchase.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorCompraComSilver() {
        LoyaltyTier tier = new SilverTier();
        PurchaseCharge purchase = new PurchaseCharge(50.0f);
        purchase.setTier(tier);
        purchase.setQuantidade(2);
        assertEquals(90.0f, purchase.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorCompraComGold() {
        LoyaltyTier tier = new GoldTier();
        PurchaseCharge purchase = new PurchaseCharge(50.0f);
        purchase.setTier(tier);
        purchase.setQuantidade(2);
        assertEquals(80.0f, purchase.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorCompraComDiamond() {
        LoyaltyTier tier = new DiamondTier();
        PurchaseCharge purchase = new PurchaseCharge(50.0f);
        purchase.setTier(tier);
        purchase.setQuantidade(2);
        assertEquals(70.0f, purchase.calcularValor(), 0.01f);
    }

}
