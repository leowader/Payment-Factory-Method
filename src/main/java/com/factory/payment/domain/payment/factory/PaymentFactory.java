package com.factory.payment.domain.payment.factory;

import com.factory.payment.domain.payment.PaymentEntity;

public abstract class PaymentFactory {

    public PaymentEntity getPayment() {
        return createPayment();
    }
    public abstract PaymentEntity createPayment();

}
