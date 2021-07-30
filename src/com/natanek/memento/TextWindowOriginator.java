package com.natanek.memento;

public class TextWindowOriginator {

    private StringBuilder currentText;

    public TextWindowOriginator() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public TextWindowMemento save() {
        return new TextWindowMemento(currentText.toString());
    }

    public void restore(TextWindowMemento save) {
        currentText = new StringBuilder(save.getText());
    }

    public StringBuilder getCurrentText() {
        return currentText;
    }
}