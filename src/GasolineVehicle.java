public class GasolineVehicle extends Vehicle{

    public GasolineVehicle(String manufacturer, String model, int year, int fuelLevel) {
        super(fuelLevel);
    }

    @Override
    public void refuel(RefuelingStrategy refuelingStrategy) {
        refuelingStrategy.refuel(this);
    }
}
