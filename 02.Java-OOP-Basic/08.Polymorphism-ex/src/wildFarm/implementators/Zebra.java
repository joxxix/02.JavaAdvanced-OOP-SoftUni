package wildFarm.implementators;

import wildFarm.abstractions.Food;
import wildFarm.abstractions.Mammal;

public class Zebra extends Mammal {
    public Zebra(String name, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(name, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void makeSound() {

    }

    @Override
    protected void eat(Food food) {

    }
}
