public class GasolineVehicle extends Vehicle{

    private int fuelLevel;

    public GasolineVehicle(String brand, String model, int year, int fuelLevel) {
        super(brand, model, year);
        this.fuelLevel = fuelLevel;
    }
}
