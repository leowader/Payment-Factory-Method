package com.factory.payment.services.notification;

import com.factory.payment.config.notification.ConfigFactoryNotification;
import com.factory.payment.domain.notification.factory.NotificationFactory;
import com.factory.payment.dtos.payment.DtoPaymentResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class NotificationService {
    @Autowired
    private ConfigFactoryNotification configFactoryNotification;

    public String  processNotification(String notificationType, DtoPaymentResponse data){
        NotificationFactory notification = configFactoryNotification.configurationFactory(notificationType);
        return  notification.getNotification().sendNotification(data);
    }
}
