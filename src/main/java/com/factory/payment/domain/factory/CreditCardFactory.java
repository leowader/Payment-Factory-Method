package com.factory.payment.domain.factory;

import com.factory.payment.domain.CreditCard;
import com.factory.payment.domain.Payment;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCard(double finalAmount ,double commissionRate, int post);
    }
}
