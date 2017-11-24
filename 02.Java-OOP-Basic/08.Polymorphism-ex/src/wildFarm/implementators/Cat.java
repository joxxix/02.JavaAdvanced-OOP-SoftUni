package wildFarm.implementators;

import wildFarm.abstractions.Felime;
import wildFarm.abstractions.Food;

public class Cat extends Felime {
    private String breed;

    public Cat(String name, String animalType, double animalWeight, int foodEaten, String breed) {
        super(name, animalType, animalWeight, foodEaten);
        this.breed = breed;
    }

    @Override
    protected void makeSound() {

    }

    @Override
    protected void eat(Food food) {

    }
}
