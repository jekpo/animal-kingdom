package animal.kingdom.animals;

import animal.kingdom.behaviors.Swimmer;
import animal.kingdom.categories.Fish;

public class Shark extends Fish implements Swimmer {

    /**
     * Stores how fast the animal can swim
     */
    private int maxWaterSpeed;

    public Shark() {
        this.setName("Shark");
        this.setMaxWaterSpeed(50);
    }

    public String swim() {
        return "Swims like a " + this.getName();
    }

    public int getMaxWaterSpeed() {
        return this.maxWaterSpeed;
    }

    public void setMaxWaterSpeed(int maxWaterSpeed) {
        this.maxWaterSpeed = maxWaterSpeed;
    }
}
