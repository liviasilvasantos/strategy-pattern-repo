package br.com.liviasilvasantos;

import java.math.BigDecimal;

public class PixPayment implements PaymentMethod {

    @Override
    public void pay(final BigDecimal amount) {
        System.out.println("generating qr code");
        System.out.println("Paid %s with pix".formatted(amount));
    }
}
