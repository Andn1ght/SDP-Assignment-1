public class DieselVehicle extends Vehicle{

    private int fuelLevel;

    public DieselVehicle(String brand, String model, int year, int fuelLevel) {
        super(brand, model, year);
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
