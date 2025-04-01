package com.example.facade.facade;

import com.example.facade.subsystem.*;

public class HomeTheaterFacade {
    TheaterLights theaterLights;
    PopcornPopper popcornPopper;
    Projector projector;
    Tuner tuner;

    public HomeTheaterFacade(TheaterLights theaterLights, PopcornPopper popcornPopper, Projector projector, Tuner tuner){
        this.theaterLights = theaterLights;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.tuner = tuner;
    }

    public void watchMovie(){
        theaterLights.dim(70);
        popcornPopper.on();
        popcornPopper.pop();

        projector.on();
        tuner.on();
    }


}
