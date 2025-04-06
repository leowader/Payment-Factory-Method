package com.factory.payment.domain.payment.factory;

import com.factory.payment.domain.payment.CreditCard;
import com.factory.payment.domain.payment.PaymentEntity;


public class CreditCardFactory extends PaymentFactory {

    @Override
    public PaymentEntity createPayment() {
        return new CreditCard();
    }
}
