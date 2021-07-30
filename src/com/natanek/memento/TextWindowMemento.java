package com.natanek.memento;

public class TextWindowMemento {

    private final String text;

    public TextWindowMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}