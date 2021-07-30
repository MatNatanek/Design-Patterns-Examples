package com.natanek.state;

public class SentState extends DocumentState {

    public SentState(Document document) {
        this.document = document;
    }

    @Override
    public void nextAction() {
        System.out.println("Document is already sent");
        throw new IllegalStateException();

    }

    @Override
    public void previousAction() {
        System.out.println("Coming back to approved State");
        document.setCurrentState(new ApprovedState(this.document));
    }
}
