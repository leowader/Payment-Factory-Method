package com.factory.payment.domain.factory;

import com.factory.payment.domain.Payment;

public abstract class PaymentFactory {

    public Payment getPayment() {
        Payment payment = createPayment();
        return payment;
    }
    public abstract  Payment createPayment();

}
