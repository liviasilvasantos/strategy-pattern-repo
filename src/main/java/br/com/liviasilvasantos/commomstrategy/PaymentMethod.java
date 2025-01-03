package br.com.liviasilvasantos.commomstrategy;

import java.math.BigDecimal;

public interface PaymentMethod {
    void pay(BigDecimal amount);
}
