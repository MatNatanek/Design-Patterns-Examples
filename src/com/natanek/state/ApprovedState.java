package com.natanek.state;

public class ApprovedState extends DocumentState {

    public ApprovedState(Document document) {
        this.document = document;
    }

    @Override
    public void nextAction() {
        System.out.println("Sending document");
        document.setCurrentState(new SentState(this.document));
    }

    @Override
    public void previousAction() {
        System.out.println("Coming back to new State");
        document.setCurrentState(new ApprovedState(this.document));
    }
}
