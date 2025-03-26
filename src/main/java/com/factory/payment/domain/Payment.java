package com.factory.payment.domain;

import lombok.Getter;
import lombok.Setter;

public interface Payment {
    Double processPayment(String paymentType,PaymentEntity payment);
}
