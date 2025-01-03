package br.com.liviasilvasantos;

import java.math.BigDecimal;

public interface PaymentMethod {
    void pay(BigDecimal amount);
}
