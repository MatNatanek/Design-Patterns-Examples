package com.natanek.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new WarningLogger(AbstractLogger.WARNING);
        AbstractLogger consoleLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextChain(fileLogger);
        fileLogger.setNextChain(consoleLogger);

        errorLogger.logMessage(AbstractLogger.INFO,
                "This is an information.");

        errorLogger.logMessage(AbstractLogger.ERROR,
                "This is an error level information.");

    }
}
