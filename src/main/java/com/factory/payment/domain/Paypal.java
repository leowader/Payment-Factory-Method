package com.factory.payment.domain;

public class Paypal extends PaymentEntity implements Payment {
    @Override
    public Double processPayment() {
        return 0.0;
    }

}
