package animal.kingdom.categories;

public abstract class Animal {

    /**
     * Name of the animal
     */
    protected String name;

    /**
     * Sets the name of the animal
     * Call this in the constructor of the animal to set the name
     * @param name
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }
}
