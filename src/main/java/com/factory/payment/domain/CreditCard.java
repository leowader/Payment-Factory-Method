package com.factory.payment.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard extends PaymentEntity implements Payment{

    public CreditCard(double finalAmount ,double commissionRate, int post) {
        super(finalAmount,commissionRate,post);
    }

    @Override
    public Double processPayment() {
        return 0.0;
    }
}
