package com.natanek.command;

public class TurnOnTvCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Turning on tv");
    }
}
