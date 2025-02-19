package com.assignment.question;

public class NotificationFactory {
    public static Notification getNotification(NotificationType notificationType, String recipient, String sender, String message) {
        switch (notificationType) {
            case EMAIL:
                return new EmailNotification(recipient, sender, message);
            case PUSH:
                return new PushNotification(recipient, message);
            case SMS:
                return new SmsNotification(recipient, message);
            default:
                throw new IllegalArgumentException("Invalid NotificationType: " + notificationType);
        }
    }
}