package br.com.liviasilvasantos;

import java.math.BigDecimal;

public class BoletoPayment implements PaymentMethod {

    @Override
    public void pay(final BigDecimal amount) {
        System.out.println("generating barcode");
        System.out.println("Paid %s with boleto".formatted(amount));
    }
}
