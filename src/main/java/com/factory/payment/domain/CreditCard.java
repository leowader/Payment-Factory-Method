package com.factory.payment.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CreditCard extends PaymentEntity implements Payment {
    @Override
    public Double processPaymentCalculate(double amount) {
        System.out.println("PROCESANDO PAGO CON TARJETA DE CREDITO");

        return 0.0;
    }

}
