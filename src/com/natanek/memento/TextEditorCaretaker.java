package com.natanek.memento;


public class TextEditorCaretaker {

    private final TextWindowOriginator textWindowOriginator;

    public TextEditorCaretaker(TextWindowOriginator textWindowOriginator) {
        this.textWindowOriginator = textWindowOriginator;
    }

    private TextWindowMemento savedTextWindow;

    public void hitSave() {
        savedTextWindow = textWindowOriginator.save();
    }

    public void hitUndo() {
        textWindowOriginator.restore(savedTextWindow);
    }

    public void write(String text) {
        textWindowOriginator.addText(text);
    }

    public void read() {
        System.out.println(textWindowOriginator.getCurrentText().toString());
    }
}