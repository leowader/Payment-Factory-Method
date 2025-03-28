package com.factory.payment.domain.factory;

import com.factory.payment.domain.DebitCard;
import com.factory.payment.domain.PaymentEntity;

public class DebitCardFactory extends PaymentFactory {

    @Override
    public PaymentEntity createPayment() {
        return new DebitCard();
    }
}
