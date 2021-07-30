package com.natanek.facade;

public class CinemaFacade {
    private final Projector projector;
    private final Lights lights;
    private final SoundSystem soundSystem;

    public CinemaFacade() {
        projector = new Projector();
        lights = new Lights();
        soundSystem = new SoundSystem();
    }

    public void playFilm() {

        this.projector.on();
        this.lights.on();
        this.soundSystem.on();
        System.out.println("Playing a movie");
    }
}
