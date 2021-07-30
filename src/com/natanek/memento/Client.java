package com.natanek.memento;

public class Client {
    public static void main(String[] args) {
        TextEditorCaretaker textEditorCaretaker = new TextEditorCaretaker(new TextWindowOriginator());
        textEditorCaretaker.write("test 1 ");
        textEditorCaretaker.write("test 1 ");
        textEditorCaretaker.read();
        textEditorCaretaker.hitSave();
        textEditorCaretaker.write("test 3");
        textEditorCaretaker.read();
        textEditorCaretaker.hitUndo();
        textEditorCaretaker.read();
    }
}
