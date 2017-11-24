package p05_SpeedRacing;

public class Car {
    private static final int DEFAULT_DISTANCE_TRAVELLED = 0;

    private String model;
    private double fuel;
    private double costPerKM;
    private int distanceTravalled;

    Car(String model, double fuel, double costPerKM) {
        this.model = model;
        this.fuel = fuel;
        this.costPerKM = costPerKM;
        this.distanceTravalled = DEFAULT_DISTANCE_TRAVELLED;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getCostPerKM() {
        return costPerKM;
    }

    public void setCostPerKM(double costPerKM) {
        this.costPerKM = costPerKM;
    }

    public int getDistanceTravalled() {
        return distanceTravalled;
    }

    public void setDistanceTravalled(int distanceTravalled) {
        this.distanceTravalled = distanceTravalled;
    }

    public void driveCar(int kilometers){
        double fuelToDrive = kilometers * this.costPerKM;

        if (fuelToDrive > this.fuel){
            throw new IllegalStateException("Insufficient fuel for the drive");
        }

        this.distanceTravalled += kilometers;
        this.fuel -= fuelToDrive;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model
                , this.fuel
                , this.distanceTravalled
        );
    }
}
