package com.natanek.state;

public class NewState extends DocumentState {

    public NewState(Document document) {
        this.document = document;
    }

    @Override
    public void nextAction() {
        System.out.println("Approving document");
        document.setCurrentState(new ApprovedState(this.document));
    }

    @Override
    public void previousAction() {
        System.out.println("No previous state");
        throw new IllegalStateException();
    }
}
