package com.sekhanov.desingpatterns.creationalpatterns.builder;

/**
 * Message
 */
public class Message {

    private String sender;
    private String receiver;
    private String theme;
    private String body;

    /**
     * @return String return the sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return String return the reciever
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param reciever the reciever to set
     */
    public void setReceiver(String reciever) {
        this.receiver = reciever;
    }

    /**
     * @return String return the theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme the theme to set
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return String return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

}