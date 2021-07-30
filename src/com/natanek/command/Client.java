package com.natanek.command;

public class Client {
    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl();
        final TurnOnTvCommand turnOnTvCommand = new TurnOnTvCommand();
        final TurnOfTvCommand turnOfTvCommand = new TurnOfTvCommand();
        remoteControl.setButton1(turnOnTvCommand);
        remoteControl.setButton2(turnOfTvCommand);
        remoteControl.executeButton1();
        remoteControl.executeButton2();
    }
}
