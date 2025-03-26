package com.factory.payment.domain;

public class Paypal extends PaymentEntity implements Payment {


    @Override
    public Double processPayment(PaymentEntity payment) {
        System.out.println("PROCESANDO PAGO CON PAYPAL");
        return 0.0;
    }

}
