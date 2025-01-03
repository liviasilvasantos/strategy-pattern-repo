package br.com.liviasilvasantos.commomstrategy;

import java.math.BigDecimal;

public class CommomStrategy {

    public static void main(String[] args) {
        var paymentMethodCode = 1; // 1 - cartao credito, 2 - boleto, 3 - pix
        var amount = BigDecimal.valueOf(3.0);

        var paymentMethod = switch (paymentMethodCode){
            case 1 -> new CreditCardPayment();
            case 2 -> new BoletoPayment();
            case 3 -> new PixPayment();
            default -> throw new IllegalStateException("Payment method not supported");
        };

        var paymentProcessor = new PaymentProcessor(paymentMethod);
        paymentProcessor.pay(amount);
    }
}

