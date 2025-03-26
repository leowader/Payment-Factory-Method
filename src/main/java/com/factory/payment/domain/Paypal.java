package com.factory.payment.domain;

public class Paypal extends PaymentEntity implements Payment {

    public Paypal() {
        this.setCommissionRate(0.02);
        this.setPost(7);
    }

    @Override
    public Double processPaymentCalculate(double amount) {
        System.out.println("PROCESANDO PAGO CON PAYPAL");
        return 0.0;
    }

}
