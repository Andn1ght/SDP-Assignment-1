public class GasolineVehicle extends Vehicle{

    private int fuelLevel;

    public GasolineVehicle(String brand, String model, int year, int fuelLevel) {
        super(brand, model, year);
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel() {
        // Quantity to refuel the vehicle
        fuelLevel += 10;
    }
}
