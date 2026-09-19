package com.shubham;

import com.shubham.notification.EmailService;
import com.shubham.notification.NotificationService;
import com.shubham.notification.SmsService;

public class OrderService {

//    NotificationService notification = new EmailService();
    NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public OrderService() {

    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
