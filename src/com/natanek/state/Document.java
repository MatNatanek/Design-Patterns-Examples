package com.natanek.state;

public class Document {

    public Document() {
        this.currentState = new NewState(this);
    }

    private DocumentState currentState;

    public void setCurrentState(DocumentState currentState) {
        this.currentState = currentState;
    }

    public void nextAction() {
        currentState.nextAction();
    }

    public void previousAction() {
        currentState.previousAction();
    }
}
