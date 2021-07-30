package com.natanek.chainofresponsibility;

public class WarningLogger extends AbstractLogger {

    public WarningLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeLog(String message) {
        System.out.println("Log: " + message);
    }
}
