package com.assignment.question;

// Part 2: Extend Notification class
public class EmailNotification extends Notification {
    private String sender;
    
    public EmailNotification(String recipient, String sender, String message) {
        super(recipient, message);
        this.sender = sender;
    }

    public String getSender() {
        return this.sender;
    }

    @Override
    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + this.getRecipient() + " from " + this.sender);
        System.out.println("Message: " + this.getMessage());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}