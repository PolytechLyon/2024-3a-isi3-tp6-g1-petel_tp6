package fr.polytech.sim;

import java.util.Random;

/**
 * A clock used to synchronize simulations.
 */
public class Clock {
    private Clock instance = null;
    private final int time = new Random().nextInt(25);

    public Clock getInstance(){
        if(instance == null){
            instance = new Clock();
            return instance;
        }
        return instance;
    }
    /**
     * Random integer between 0 and 24 inclusive.
     */
    public int getTime() {
        return this.time;
    }
}
