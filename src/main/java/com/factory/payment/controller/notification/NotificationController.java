package com.factory.payment.controller.notification;

import com.factory.payment.dtos.payment.DtoPaymentResponse;
import com.factory.payment.services.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/{notificationType}")
    public ResponseEntity<?> processNotification(@PathVariable String notificationType, @RequestBody DtoPaymentResponse data) {
        String response= notificationService.processNotification(notificationType, data);
        return ResponseEntity.ok(response);
    }
}
