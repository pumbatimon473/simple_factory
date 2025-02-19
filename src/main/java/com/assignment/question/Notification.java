package com.assignment.question;

// Part 1: Abstract common attrs and methods
public abstract class Notification {
    // common attrs
    private String recipient;
    private String message;

    // ctor
    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }


    public abstract NotificationType notificationType();

    // common method
    public abstract void sendNotification();

    // getters
    public String getRecipient() {
        return this.recipient;
    }

    public String getMessage() {
        return this.message;
    }

}