package com.factory.payment.domain;

import lombok.Getter;
import lombok.Setter;

public interface Payment {

    double finalAmount=0.0;
    Double processPayment();
}
