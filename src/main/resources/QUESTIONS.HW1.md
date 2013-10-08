## HOMEWORK 1 QUESTIONS

### (Q1) Adding Additional Animals

Add the following animals to the animal.kingdom.animals package

The animals will extend a class in thier category and implements the interface that describes thier behavior

For example Flamingo will extend the Bird class and implement the Swimmer, Runner and Flyer interfaces.

* Aligator (A Reptile that can Run and Swim)
* Flamingo (A Bird that can Swim, Run, and Fly)
* Zebra (A Mammal that can Run and Swim)
* CockRoach (An insect that can Fly)
* Salmon (A Fish can can Swim)
* Penguin (A Mammal that can Swim)
* Bat (A Mammal that can Fly)
* HoneyBee (An insect that can Fly)

You can follow other examples in the animal.kingdom.animals package.

Pay attention to how the classes must implement methods from the Interfaces.

```java

package animal.kingdom.animals;

import animal.kingdom.behaviors.Flyer;
import animal.kingdom.behaviors.Runner;
import animal.kingdom.behaviors.Swimmer;
import animal.kingdom.categories.Bird;

public class Goose extends Bird implements Flyer, Runner, Swimmer {

    /**
     * Property of the class that stores how many wings the animal has
     */
    private int wingCount;

    /**
     * Stores how many feet the animal has
     */
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

    public Goose() {
        this.setName("Goose");
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

```

For interfaces that require getters and setters, make sure that the properties are created in the classes.

### (Q2) Creating Instances of Animals

Following the example in the class animal.kingdom.stage.AflacOnStage

```java
package animal.kingdom.stage;

import animal.kingdom.animals.Duck;

public class AflacOnStage {

    public static void main(String[]args) {

        Duck runner1 = new Duck();
        Parrot flyer1 = new Parrot();
        Tilapia swimmer1 = new Tilapia();

        System.out.println(runner1.run());
        System.out.println(swimmer1.run());
        System.out.println(flyer1.run());
    }
}
```

Create a class called Question2Stage in the animal.kingdom.stage package for all classes created in Q1 and:

Inside the main() function of this class

* Print out the return value of the run() method for all classes that implement the Runner interface.
* Print out the return value of the swim() method for all classes that implement the Swimmer interface.
* Print out the return value of the fly() method for all classes that implement the Flyer interface.

Run the class as a Java application to see the results.

In your own words, please describe why each of the methods are doing what they are doing on the screen




