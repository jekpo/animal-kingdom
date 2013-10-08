package animal.kingdom.stage;

import java.util.ArrayList;
import java.util.List;

import animal.kingdom.animals.Duck;
import animal.kingdom.animals.Goat;
import animal.kingdom.animals.Ostrich;
import animal.kingdom.animals.Tiger;
import animal.kingdom.behaviors.Runner;

public class RunnerTotalFeetCount {

    public static void main(String[]args) {

        List <Runner> runners = new ArrayList<Runner>();

        int totalFeetCount = 0;

        runners.add(new Duck());
        runners.add(new Goat());
        runners.add(new Ostrich());
        runners.add(new Tiger());

        for (Runner runner : runners) {
            totalFeetCount = totalFeetCount + runner.getFeetCount();
        }

        System.out.println("There total number of feet is " + totalFeetCount);
    }
}
