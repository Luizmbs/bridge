package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubscriptionChargeTest {

    @Test
    void deveRetornarValorAssinaturaComBronze() {
        LoyaltyTier tier = new BronzeTier();
        SubscriptionCharge subscription = new SubscriptionCharge(100.0f);
        subscription.setTier(tier);
        assertEquals(100.0f, subscription.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAssinaturaComSilver() {
        LoyaltyTier tier = new SilverTier();
        SubscriptionCharge subscription = new SubscriptionCharge(100.0f);
        subscription.setTier(tier);
        assertEquals(90.0f, subscription.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAssinaturaComGold() {
        LoyaltyTier tier = new GoldTier();
        SubscriptionCharge subscription = new SubscriptionCharge(100.0f);
        subscription.setTier(tier);
        assertEquals(80.0f, subscription.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorAssinaturaComDiamond() {
        LoyaltyTier tier = new DiamondTier();
        SubscriptionCharge subscription = new SubscriptionCharge(100.0f);
        subscription.setTier(tier);
        assertEquals(70.0f, subscription.calcularValor(), 0.01f);
    }

}
