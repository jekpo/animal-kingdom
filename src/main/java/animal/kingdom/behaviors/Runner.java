package animal.kingdom.behaviors;

/**
 * Runner
 *
 */
public interface Runner {

    /**
     * Describes how the animal runs
     *
     * For example: Runs like an Horse
     * @return
     */
    public String run();

    /**
     * Returns the number of feet the animal has
     * @return
     */
    public int getFeetCount();

    /**
     * Sets how many feet the animal has
     * @param feetCount
     */
    public void setFeetCount(int feetCount);

    /**
     * Returns how fast the animal can run on the ground
     * @return
     */
    public int getMaxGroundSpeed();

    /**
     * Sets how fast the animal can run on the ground
     * @param maxGroundSpeed
     */
    public void setMaxGroundSpeed(int groundSpeed);
}
