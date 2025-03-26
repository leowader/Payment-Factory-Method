package com.factory.payment.domain.factory;

import com.factory.payment.domain.DebitCart;
import com.factory.payment.domain.Payment;

public class DebitCardFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new DebitCart();
    }
}
