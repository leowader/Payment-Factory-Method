package com.factory.payment.domain.payment.factory;

import com.factory.payment.domain.payment.DebitCard;
import com.factory.payment.domain.payment.PaymentEntity;

public class DebitCardFactory extends PaymentFactory {

    @Override
    public PaymentEntity createPayment() {
        return new DebitCard();
    }
}
