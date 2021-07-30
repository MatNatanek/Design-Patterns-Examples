package com.natanek.chainofresponsibility;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int WARNING = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextChain(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            writeLog(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void writeLog(String log);

}
