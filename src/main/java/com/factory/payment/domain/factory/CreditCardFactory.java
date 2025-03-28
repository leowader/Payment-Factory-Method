package com.factory.payment.domain.factory;

import com.factory.payment.domain.CreditCard;
import com.factory.payment.domain.PaymentEntity;


public class CreditCardFactory extends PaymentFactory {

    @Override
    public PaymentEntity createPayment() {
        return new CreditCard();
    }
}
