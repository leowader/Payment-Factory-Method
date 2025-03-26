package com.factory.payment.domain.factory;

import com.factory.payment.domain.Payment;
import com.factory.payment.domain.Paypal;

public class PaypalFactory extends PaymentFactory {
    @Override
    public Payment createPayment(){
        return new Paypal();
    }
}
