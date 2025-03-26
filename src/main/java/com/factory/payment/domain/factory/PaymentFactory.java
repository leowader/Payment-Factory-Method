package com.factory.payment.domain.factory;

import com.factory.payment.domain.Payment;

public abstract class PaymentFactory {

    public Payment getPayment() {
        return createPayment();
    }
    public abstract  Payment createPayment();

}
