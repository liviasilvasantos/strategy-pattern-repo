package br.com.liviasilvasantos.modernstrategy;

import java.math.BigDecimal;

public class PaymentMethods {
    public static void creditCard(final BigDecimal amount){
        System.out.println("validating credit card");
        System.out.println("Paid %s with credit card".formatted(amount));
    }

    public static void boleto(final BigDecimal amount){
        System.out.println("generating barcode");
        System.out.println("Paid %s with boleto".formatted(amount));
    }

    public static void pix(final BigDecimal amount){
        System.out.println("generating qr code");
        System.out.println("Paid %s with pix".formatted(amount));
    }
}
