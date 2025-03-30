package com.factory.payment.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.dtos.DtoPayment;
import com.factory.payment.dtos.DtoPaymentResponse;
import com.factory.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins =  "http://localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/{paymentType}")
    public ResponseEntity<?> processPayment(@PathVariable String paymentType, @RequestBody DtoPayment dtoPayment) {
        double finalAmount = paymentService.processPayment(paymentType, dtoPayment.getAmount());
        DtoPaymentResponse response = new DtoPaymentResponse(
                "SUCCESS",
                "Payment processed successfully",
                paymentType,
                dtoPayment.getAmount(),
                finalAmount
        );
        return ResponseEntity.ok(response);
    }
}


