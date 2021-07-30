package com.natanek.chainofresponsibility;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeLog(String message) {
        System.out.println("Log: " + message);
    }
}
