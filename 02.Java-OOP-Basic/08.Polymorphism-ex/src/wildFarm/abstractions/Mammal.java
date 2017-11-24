package wildFarm.abstractions;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String name, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(name, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }
}
