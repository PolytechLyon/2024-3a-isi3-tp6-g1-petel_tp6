package fr.polytech.sim.cycling;

import fr.polytech.sim.transport.MobileObject;
import fr.polytech.sim.transport.Vehicle;
import fr.polytech.sim.transport.Wheel;

public class TagAlongBike extends Bike {
    public TagAlongBike() {
        this.components.add(new SimpleBike());
        this.components.add(new Wheel(this));
        this.components.add(new Wheel(this));
    }

    @Override
    public double getPush() {
        return 50;
    }
}
