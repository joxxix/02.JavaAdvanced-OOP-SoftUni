package wildFarm.implementators;

import wildFarm.abstractions.Food;
import wildFarm.abstractions.Mammal;

public class Mouse extends Mammal {
    public Mouse(String name, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(name, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("cvr");
    }

    @Override
    protected void eat(Food food) {
        
    }
}
