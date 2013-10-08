package animal.kingdom.animals;

import animal.kingdom.behaviors.Runner;
import animal.kingdom.categories.Mammal;

public class Tiger extends Mammal implements Runner {

    private int feetCount;

    private int maxGroundSpeed;

    public Tiger() {
        this.setName("Tiger");
        this.setFeetCount(4);
        this.setMaxGroundSpeed(80);
    }

    public String run() {
        return "Runs like a " + this.getName();
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
}
