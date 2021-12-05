package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {
    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;}

    private MessageService messageService = new MessageService() {
        @Override
        public void send(String message, String receiver) {

        }
    };

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}