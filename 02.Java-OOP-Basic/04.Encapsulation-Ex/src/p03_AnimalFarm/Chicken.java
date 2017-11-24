package p03_AnimalFarm;

public class Chicken {
    private String name;
    private int age;
    private double eggProduce;

    Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
        eggsPerDay(this.eggProduce);
    }

    private void setName(String name) {
        if (name.equals("") || name.equals(" ") || name == null){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age >= 16){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double eggsPerDay(double eggProduce){
        if (age < 6){
            return this.eggProduce = 2;
        }else if (age >= 6 && age <= 12){
            return this.eggProduce = 1;
        }else {
            return  this.eggProduce = 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.0f eggs per day.",
                this.name,
                this.age,
                this.eggProduce);
    }
}
