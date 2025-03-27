package com.factory.payment.dtos;

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
    private double finalAmount;
    private double post;
    private double commissionRate;
}
