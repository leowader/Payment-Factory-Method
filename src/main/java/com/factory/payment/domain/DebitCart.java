package com.factory.payment.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DebitCart extends PaymentEntity implements Payment{

    @Override
    public Double processPayment(String paymentType, PaymentEntity payment) {
        System.out.println("PROCESANDO PAGO CON TARJETA DEBITO");
        return 0.0;
    }
}
