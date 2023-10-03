public class GasolineVehicle extends Vehicle {
    public GasolineVehicle(int fuelLevel) {
        super(fuelLevel);
    }

    @Override
    public void refuel(RefuelingStrategy refuelingStrategy, int amountToRefuel) {
        refuelingStrategy.refuel(this, amountToRefuel);
    }
}