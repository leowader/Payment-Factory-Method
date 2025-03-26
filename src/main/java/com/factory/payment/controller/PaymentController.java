package com.factory.payment.controller;

import com.factory.payment.domain.Payment;
import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.dtos.DtoPayment;
import com.factory.payment.dtos.PaymentResponseDto;
import com.factory.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/{paymentType}")
    public PaymentResponseDto processPayment(@PathVariable String paymentType, @RequestBody DtoPayment dtoPayment) {

        Payment payment = paymentService.processPayment(paymentType, dtoPayment.getAmount());
        PaymentEntity paymentEntity = (PaymentEntity) payment;
        return new PaymentResponseDto(
                "SUCCESS",
                "Pago realizado exitosamente!",
                paymentType,
                paymentEntity.getPost(),
                paymentEntity.getCommissionRate(),
                paymentEntity.getAmount()
        );
    }

}
