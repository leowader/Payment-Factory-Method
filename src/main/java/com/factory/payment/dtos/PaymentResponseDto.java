package com.factory.payment.dtos;
import com.factory.payment.domain.PaymentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentResponseDto {
    private String status;
    private String message;
    private String paymentType;
    private double amount;
    private double commissionRate;
    private double post;
    private double totalAmount;

    public PaymentResponseDto(String status, String message, String paymentType, double post, double commissionRate, double finalAmount) {
        this.status = status;
        this.message = message;
        this.paymentType = paymentType;
        this.commissionRate = commissionRate;
        this.post = post;
        this.totalAmount = finalAmount;
    }
}