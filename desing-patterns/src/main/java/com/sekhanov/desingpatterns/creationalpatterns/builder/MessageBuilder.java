package com.sekhanov.desingpatterns.creationalpatterns.builder;

/**
 * MessageBuilder
 */
public class MessageBuilder {

    private Message message;

    public MessageBuilder(Message message) {
        this.message = message;
    }

    public MessageBuilder setSender(String sender) {
        this.message.setSender(sender);
        return this;
    }

    public MessageBuilder setReceiver(String receiver) {
        this.message.setReceiver(receiver);
        return this;        
    }

    public MessageBuilder setTheme(String theme) {
        this.message.setTheme(theme);
        return this;
    }

    public MessageBuilder setBody(String body) {
        this.message.setBody(body);
        return this;
    }

    public void sendMessage() {
        System.out.println("message sent" + message.getTheme());
    }
}