package br.com.liviasilvasantos.modernstrategy;

import java.math.BigDecimal;
import java.util.function.Consumer;

public enum PaymentMethodEnum {
    
    CREDIT_CARD(PaymentMethods::creditCard), BOLETO(PaymentMethods::boleto), PIX(PaymentMethods::pix);

    private final Consumer<BigDecimal> paymentStrategy;

    PaymentMethodEnum(Consumer<BigDecimal> paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(final BigDecimal amount){
        paymentStrategy.accept(amount);
    }
}
