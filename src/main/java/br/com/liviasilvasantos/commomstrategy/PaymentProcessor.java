package br.com.liviasilvasantos.commomstrategy;

import java.math.BigDecimal;

public class PaymentProcessor {

    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(final BigDecimal amount){
        if(paymentMethod == null){
            throw new IllegalStateException("Payment method not supported");
        }
        paymentMethod.pay(amount);
    }
}
