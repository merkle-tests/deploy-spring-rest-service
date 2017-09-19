package com.github.unqualsevol.spring.model;

/**
 * Created by agimenez on 19/09/17.
 */
public class Message {
    private final String hello;

    public Message(String value) {
        hello = value;
    }

    public String getHello() {
        return hello;
    }
}
