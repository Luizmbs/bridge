package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFeeChargeTest {

    @Test
    void deveRetornarValorTaxaServicoComBronze() {
        LoyaltyTier tier = new BronzeTier();
        ServiceFeeCharge serviceFee = new ServiceFeeCharge(30.0f);
        serviceFee.setTier(tier);
        assertEquals(30.0f, serviceFee.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorTaxaServicoComSilver() {
        LoyaltyTier tier = new SilverTier();
        ServiceFeeCharge serviceFee = new ServiceFeeCharge(30.0f);
        serviceFee.setTier(tier);
        assertEquals(30.0f, serviceFee.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorTaxaServicoComGold() {
        LoyaltyTier tier = new GoldTier();
        ServiceFeeCharge serviceFee = new ServiceFeeCharge(30.0f);
        serviceFee.setTier(tier);
        assertEquals(30.0f, serviceFee.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorTaxaServicoComDiamond() {
        LoyaltyTier tier = new DiamondTier();
        ServiceFeeCharge serviceFee = new ServiceFeeCharge(30.0f);
        serviceFee.setTier(tier);
        assertEquals(30.0f, serviceFee.calcularValor(), 0.01f);
    }

}
