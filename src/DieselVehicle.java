public class DieselVehicle extends Vehicle{

    private int fuelLevel;

    public DieselVehicle(String brand, String model, int year, int fuelLevel) {
        super(brand, model, year);
        this.fuelLevel = fuelLevel;
    }
}
