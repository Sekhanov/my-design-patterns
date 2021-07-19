package com.sekhanov.desingpatterns.creationalpatterns.builder;

/**
 * Message
 */
public class Message {

    private String sender;
    private String receiver;
    private String theme;
    private String body;

    private Message(String sender, String receiver, String theme, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.theme = theme;
        this.body = body;
    }

    public static class Builder {

        private String sender;
        private String receiver;
        private String theme = "default theme";
        private String body = "default body";

        public Builder(String receiver, String sender) {
            this.receiver = receiver;
            this.sender = sender;
        }

        public Builder setTheme(String theme) {
            this.theme = theme;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Message build() {
            return new Message(this.sender, this.receiver, this.theme, this.body);

        }
    }

    @Override public String toString() {
        return "Message{" +
            "sender='" + sender + '\'' +
            ", receiver='" + receiver + '\'' +
            ", theme='" + theme + '\'' +
            ", body='" + body + '\'' +
            '}';
    }

    public void sendMessage() {
        System.out.println(this + "sent");
    }
}
