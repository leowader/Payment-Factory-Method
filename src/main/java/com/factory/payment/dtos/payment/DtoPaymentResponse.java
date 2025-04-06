package com.factory.payment.dtos.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DtoPaymentResponse {
    private String state;
    private String message;
    private String paymentType;
    private double initialAmount;
    private double finalAmount;
}
