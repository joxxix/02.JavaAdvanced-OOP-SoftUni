package wildFarm.abstractions;

public abstract class Animal {
    private String name;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String name, String animalType, double animalWeight, int foodEaten) {
        this.name = name;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    protected abstract void makeSound();
    protected abstract void eat(Food food);
}
