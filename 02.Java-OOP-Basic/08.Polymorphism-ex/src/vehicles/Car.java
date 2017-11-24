package vehicles;

public class Car extends Vehicles {

    public Car(double fuelQuantity, double fuelConsumptionInLetersPerKm) {
        super(fuelQuantity, fuelConsumptionInLetersPerKm);
    }

    @Override
    public void setFuelConsumptionInLetersPerKm(double fuelConsumptionInLetersPerKm) {
        super.setFuelConsumptionInLetersPerKm(fuelConsumptionInLetersPerKm + 0.9);
    }

    @Override
    public void drive(double distance) {
        double neededFuel = super.getFuelConsumptionInLetersPerKm() * distance;
        if (neededFuel > super.getFuelQuantity()){
            throw new IllegalStateException("Car needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity() - neededFuel);
    }

    @Override
    protected void refill(double liters) {
        super.setFuelQuantity(super.getFuelQuantity() + liters);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }
}
