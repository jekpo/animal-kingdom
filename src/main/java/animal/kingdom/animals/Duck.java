package animal.kingdom.animals;

import animal.kingdom.behaviors.Flyer;
import animal.kingdom.behaviors.Runner;
import animal.kingdom.behaviors.Swimmer;
import animal.kingdom.categories.Bird;

public class Duck extends Bird implements Flyer, Runner, Swimmer {

    /**
     * Property of the class that stores how many wings the animal has
     */
    private int wingCount;

    private int feetCount;

    /**
     * Stores how fast the animal can fly
     */
    private int maxAirSpeed;

    /**
     * Stores how fast the animal can swim
     */
    private int maxWaterSpeed;


    /**
     * How fast the animal can run on land
     */
    private int maxGroundSpeed;

    public Duck() {
        this.setName("Duck");
        this.setWingCount(2);
        this.setFeetCount(2);
        this.setMaxGroundSpeed(60);
        this.setMaxWaterSpeed(50);
        this.setMaxAirSpeed(150);
    }

    public String swim() {
        return "Swims like a " + this.getName();
    }

    public String run() {
        return "Runs like a " + this.getName();
    }

    public String fly() {
        return "Flies like a " + this.getName();
    }

    public int getMaxWaterSpeed() {
        return this.maxWaterSpeed;
    }

    public void setMaxWaterSpeed(int maxWaterSpeed) {
        this.maxWaterSpeed = maxWaterSpeed;
    }

    public int getFeetCount() {
        return this.feetCount;
    }

    public void setFeetCount(int feetCount) {
        this.feetCount = feetCount;
    }

    public int getMaxGroundSpeed() {
        return this.maxGroundSpeed;
    }

    public void setMaxGroundSpeed(int groundSpeed) {
        this.maxGroundSpeed = groundSpeed;
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
