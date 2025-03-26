package com.factory.payment.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CreditCard extends PaymentEntity implements Payment {

    @Override
    public Double processPayment(PaymentEntity payment) {
        System.out.println("PROCESANDO PAGO CON TARJETA DE CREDITO");
        return 0.0;
    }

}
