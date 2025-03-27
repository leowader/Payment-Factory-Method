package com.factory.payment.controller;

import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.dtos.DtoPayment;
import com.factory.payment.dtos.DtoPaymentResponse;
import com.factory.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/{paymentType}")
    public ResponseEntity<?> processPayment(@PathVariable String paymentType, @RequestBody DtoPayment dtoPayment) {
        PaymentEntity paymentEntity = paymentService.processPayment(paymentType, dtoPayment.getAmount());


        DtoPaymentResponse response = new DtoPaymentResponse(
                "SUCCESS",
                "Payment processed successfully",
                paymentType,
                paymentEntity.getAmount(),
                paymentEntity.getPost(),
                paymentEntity.getCommissionRate()
        );

        return ResponseEntity.ok(response);
    }
}


