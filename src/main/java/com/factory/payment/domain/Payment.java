package com.factory.payment.domain;

public interface Payment {
    Double processPayment(PaymentEntity payment);
}
