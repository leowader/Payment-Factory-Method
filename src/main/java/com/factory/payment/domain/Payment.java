package com.factory.payment.domain;
public interface Payment {
    Double processPayment(String paymentType,PaymentEntity payment);
}
