package com.factory.payment.controller;

import com.factory.payment.domain.PaymentEntity;
import com.factory.payment.dtos.DtoPayment;
import com.factory.payment.dtos.DtoResponse;
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
        DtoResponse response = new DtoResponse();
        response.setFinalAmount(paymentService.processPayment(paymentType, dtoPayment.getAmount()));
        response.setMessage("pago realizado");
        response.setMethod(paymentType);
        response.setStatus("OK");
        return ResponseEntity.ok(response);
    }

}
