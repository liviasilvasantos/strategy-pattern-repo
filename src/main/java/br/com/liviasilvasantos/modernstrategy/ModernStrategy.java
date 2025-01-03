package br.com.liviasilvasantos.modernstrategy;

import java.math.BigDecimal;

public class ModernStrategy {

    public static void main(String[] args) {
        var paymentMethod = "PIX";
        var amount = BigDecimal.valueOf(3.0);
        PaymentMethodEnum.valueOf(paymentMethod).pay(amount);
    }
}
