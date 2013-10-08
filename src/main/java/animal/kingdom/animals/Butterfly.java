package animal.kingdom.animals;

import animal.kingdom.behaviors.Flyer;
import animal.kingdom.categories.Insect;

public class Butterfly extends Insect implements Flyer {

    /**
     * Property of the class that stores how many wings the animal has
     */
    private int wingCount;

    /**
     * Stores how fast the animal can fly
     */
    private int maxAirSpeed;

    public Butterfly() {
        this.setName("Butterfly");
        this.setWingCount(4);
        this.setMaxAirSpeed(2);
    }

    public String fly() {
        return "Flies like a " + this.getName();
    }

    public int getWingCount() {
        return this.wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public int getMaxAirSpeed() {
        return this.maxAirSpeed;
    }

    public void setMaxAirSpeed(int maxAirSpeed) {
        this.maxAirSpeed = maxAirSpeed;
    }
}
