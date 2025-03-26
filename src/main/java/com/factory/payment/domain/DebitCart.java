package com.factory.payment.domain;

public class DebitCart implements Payment{
    @Override
    public Double processPayment() {
        return 0.0;
    }
}
