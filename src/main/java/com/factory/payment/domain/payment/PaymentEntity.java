package com.factory.payment.domain.payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PaymentEntity  {
    public double amount;
    public double commissionRate;
    public int post;
    public  int amountCondition;

    public double calculateAmount(double amount, double commissionRate, int post, int amountCondition) {
        double finalAmount = amount + (amount * commissionRate);
        return finalAmount > amountCondition ? finalAmount + post : finalAmount;
    }
}
