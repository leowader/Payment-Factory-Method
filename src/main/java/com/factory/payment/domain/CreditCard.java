package com.factory.payment.domain;

import lombok.Getter;
import lombok.Setter;

public class CreditCard extends PaymentEntity implements Payment {
    public CreditCard(double amount, double commissionRate, int post) {
        super(amount, commissionRate, post);
    }

    @Override
    public Double processPayment(String paymentType, PaymentEntity payment) {
        System.out.println("PROCESANDO PAGO CON TARJETA DE CREDITO");
        return 0.0;
    }
}
