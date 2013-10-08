package animal.kingdom.animals;

import animal.kingdom.behaviors.Runner;
import animal.kingdom.categories.Bird;

public class Ostrich extends Bird implements Runner {

    private int feetCount;

    private int maxGroundSpeed;

    public Ostrich() {
        this.setName("Ostrich");
        this.setFeetCount(2);
        this.setMaxGroundSpeed(15);
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
