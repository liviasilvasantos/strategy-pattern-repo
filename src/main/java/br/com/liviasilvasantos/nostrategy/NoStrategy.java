package br.com.liviasilvasantos.nostrategy;

import java.math.BigDecimal;

public class NoStrategy {

    public static void main(String[] args) {
        int paymentMethod = 3; // 1 - cartao credito, 2 - boleto, 3 - pix
        BigDecimal amount = BigDecimal.valueOf(3.0);

        if(paymentMethod == 1){
            System.out.println("validating credit card");
            System.out.println("Paid %s with credit card".formatted(amount));
        } else if (paymentMethod == 2) {
            System.out.println("generating barcode");
            System.out.println("Paid %s with boleto".formatted(amount));
        } else if (paymentMethod == 3) {
            System.out.println("generating qr code");
            System.out.println("Paid %s with pix".formatted(amount));
        } else {
            throw new IllegalStateException("Payment method not supported");
        }
    }
}
