package vehicles;

public abstract class Vehicles {
    private double fuelQuantity;
    private double fuelConsumptionInLetersPerKm;

    protected Vehicles(double fuelQuantity, double fuelConsumptionInLetersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumptionInLetersPerKm(fuelConsumptionInLetersPerKm);
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getFuelConsumptionInLetersPerKm() {
        return this.fuelConsumptionInLetersPerKm;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumptionInLetersPerKm(double fuelConsumptionInLetersPerKm) {
        this.fuelConsumptionInLetersPerKm = fuelConsumptionInLetersPerKm;
    }

    protected abstract void drive(double distance);


    protected abstract void refill(double liters);

    @Override
    public String toString() {
        return super.toString();
    }
}
