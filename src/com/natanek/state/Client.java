package com.natanek.state;

public class Client {

    public static void main(String[] args) {
        Document document = new Document();
        document.nextAction();
        document.nextAction();
        document.previousAction();
    }
}
