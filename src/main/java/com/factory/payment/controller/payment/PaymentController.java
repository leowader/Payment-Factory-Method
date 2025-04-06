package com.factory.payment.controller.payment;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.factory.payment.dtos.payment.DtoPayment;
import com.factory.payment.dtos.payment.DtoPaymentResponse;
import com.factory.payment.services.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins =  "http://localhost:5173/", allowCredentials = "true")
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


