package animal.kingdom.behaviors;

/**
 * Swimmer Interface
 *
 */
public interface Swimmer {

    /**
     * Describes how the animal swims
     *
     * For example: Swims like an Dolphin
     * @return
     */
    public String swim();

    /**
     * Returns how fast the animal can swim in the water
     * @return
     */
    public int getMaxWaterSpeed();

    /**
     * Sets how fast this animal can swim in the water
     * @param maxWaterSpeed
     */
    public void setMaxWaterSpeed(int maxWaterSpeed);
}
