package vehicles;

public class Truck extends Vehicles{

    public Truck(double fuelQuantity, double fuelConsumptionInLetersPerKm) {
        super(fuelQuantity, fuelConsumptionInLetersPerKm);
    }

    @Override
    public void setFuelConsumptionInLetersPerKm(double fuelConsumptionInLetersPerKm) {
        super.setFuelConsumptionInLetersPerKm(fuelConsumptionInLetersPerKm + 1.6);
    }

    @Override
    protected void drive(double distance) {
        double neededFuel = super.getFuelConsumptionInLetersPerKm() * distance;
        if (neededFuel > super.getFuelQuantity()){
            throw new IllegalStateException("Truck needs refueling");
        }
        super.setFuelQuantity(super.getFuelQuantity() - neededFuel);
    }

    @Override
    protected void refill(double liters) {
        super.setFuelQuantity(super.getFuelQuantity() + liters * 0.95);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
    }
}
