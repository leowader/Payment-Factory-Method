package com.factory.payment.domain.factory;

import com.factory.payment.domain.PaymentEntity;

public abstract class PaymentFactory {

    public PaymentEntity getPayment() {
        return createPayment();
    }
    public abstract PaymentEntity createPayment();

}
