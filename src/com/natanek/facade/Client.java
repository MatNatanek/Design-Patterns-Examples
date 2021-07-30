package com.natanek.facade;

public class Client {

    public static void main(String[] args) {
        final CinemaFacade cinemaFacade = new CinemaFacade();
        cinemaFacade.playFilm();
    }
}
