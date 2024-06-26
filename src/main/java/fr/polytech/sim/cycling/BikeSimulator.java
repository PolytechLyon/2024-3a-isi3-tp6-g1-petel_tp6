package fr.polytech.sim.cycling;

import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.ConcreteFactory;
import fr.polytech.sim.log.FileLogger;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.utils.Context;

import java.util.Iterator;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = ConcreteFactory.loggerFactory("BikeSimulator");

    public void run() {
        Iterator<Bike> iter = Context.injectAll(Bike.class);
        while(iter.hasNext()){
            Bike bike = iter.next();
            this.logger.log("Bike's speed %.2f Km/h.", bike.getVelocity());
            this.logger.log("Bike's mass %.2f Kg.", bike.getMass());
        }

    }
}
