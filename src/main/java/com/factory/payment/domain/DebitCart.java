package com.factory.payment.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class DebitCart extends PaymentEntity implements Payment {
    public DebitCart() {
        this.setCommissionRate(0.03);
        this.setPost(10);
    }

    @Override
    public Double processPayment(PaymentEntity payment) {
        System.out.println("PROCESANDO PAGO CON TARJETA DEBITO");
        return 0.0;
    }


}
