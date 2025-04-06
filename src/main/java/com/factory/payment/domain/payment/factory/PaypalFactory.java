package com.factory.payment.domain.payment.factory;

import com.factory.payment.domain.payment.PaymentEntity;
import com.factory.payment.domain.payment.Paypal;

public class PaypalFactory extends PaymentFactory {
    @Override
    public PaymentEntity createPayment(){
        return new Paypal();
    }
}
