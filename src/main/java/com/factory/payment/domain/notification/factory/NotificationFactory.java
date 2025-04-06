package com.factory.payment.domain.notification.factory;

import com.factory.payment.domain.notification.INotification;

public abstract class NotificationFactory {

    public INotification getNotification(){

        return createNotification();

    }

    public abstract INotification createNotification();
}
