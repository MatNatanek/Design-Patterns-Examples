package com.natanek.command;

public class RemoteControl {

    private Command button1;

    private Command button2;

    public void setButton1(Command command) {
        this.button1 = command;

    }

    public void setButton2(Command command) {
        this.button2 = command;

    }

    public void executeButton1() {
        button1.execute();
    }

    public void executeButton2() {
        button2.execute();
    }
}
