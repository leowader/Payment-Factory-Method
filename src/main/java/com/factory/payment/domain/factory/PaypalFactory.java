package com.factory.payment.domain.factory;

import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.domain.Paypal;

public class PaypalFactory extends PaymentFactory {
    @Override
    public PaymentEntity createPayment(){
        return new Paypal();
    }
}
