package com.nklkarthi.axon.eventhandlers;

import com.nklkarthi.axon.events.MessageReadEvent;
import com.nklkarthi.axon.events.MessageCreatedEvent;
import org.axonframework.eventhandling.EventHandler;


public class MessagesEventHandler {

    @EventHandler
    public void handle(MessageCreatedEvent event) {
        System.out.println("Message received: " + event.getText() + " (" + event.getId() + ")");
    }

    @EventHandler
    public void handle(MessageReadEvent event) {
        System.out.println("Message read: " + event.getId());
    }
}