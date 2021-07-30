package com.natanek.command;

public class TurnOfTvCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Turning of tv");
    }
}
