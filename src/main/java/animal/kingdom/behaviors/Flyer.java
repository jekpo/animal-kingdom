package animal.kingdom.behaviors;

/**
 * Flyer
 *
 */
public interface Flyer {

    /**
     * Describes how the animal flies
     *
     * For example: Flies like an Eagle
     * @return
     */
    public String fly();

    /**
     * Returns the number of wings the animal has
     * @return
     */
    public int getWingCount();

    /**
     * Sets how many wings the animal has
     * @param wingCount
     */
    public void setWingCount(int wingCount);

    /**
     * Returns how fast the animal can fly in the air
     * @return
     */
    public int getMaxAirSpeed();

    /**
     * Sets how fast this animal can fly in the air
     * @param maxAirSpeed
     */
    public void setMaxAirSpeed(int maxAirSpeed);
}
