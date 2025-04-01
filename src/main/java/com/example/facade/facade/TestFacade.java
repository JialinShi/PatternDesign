package com.example.facade.facade;

import com.example.facade.subsystem.PopcornPopper;
import com.example.facade.subsystem.Projector;
import com.example.facade.subsystem.TheaterLights;
import com.example.facade.subsystem.Tuner;

public class TestFacade {

    public static void main(String[] args) {
        TheaterLights theaterLights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Tuner tuner = new Tuner();

        HomeTheaterFacade facade = new HomeTheaterFacade(theaterLights,popcornPopper,projector,tuner);
        facade.watchMovie();
    }

}
