package br.com.liviasilvasantos.commomstrategy;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(final BigDecimal amount) {
        System.out.println("validating credit card");
        System.out.println("Paid %s with credit card".formatted(amount));
    }
}
