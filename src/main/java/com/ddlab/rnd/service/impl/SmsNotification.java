package com.ddlab.rnd.service.impl;

import com.ddlab.rnd.service.NotificationSender;

public class SmsNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification: " + message);
    }
}