package com.factory.payment.config.notification;

import com.factory.payment.domain.notification.factory.EmailFactory;
import com.factory.payment.domain.notification.factory.NotificationFactory;
import com.factory.payment.domain.notification.factory.SMSFactory;
import com.factory.payment.domain.notification.factory.WhatsappFactory;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class ConfigFactoryNotification {
    private NotificationFactory notificationFactory;

    public NotificationFactory configurationFactory(String paymentType) {
        return switch (paymentType.toLowerCase()) {
            case "sms" -> new SMSFactory();
            case "whatsapp" -> new WhatsappFactory();
            case "email" -> new EmailFactory();
            default -> throw new IllegalArgumentException("Método de notificacion no soportado: " + paymentType);
        };
    }
}
