package com.natanek.state;

public abstract class DocumentState {
    public Document document;

    abstract void nextAction();

    abstract void previousAction();

}
