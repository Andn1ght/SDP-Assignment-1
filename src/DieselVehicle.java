public class DieselVehicle extends Vehicle{

    public DieselVehicle(int fuelLevel) {
        super(fuelLevel);
    }

    @Override
    public void refuel(RefuelingStrategy refuelingStrategy) {
        refuelingStrategy.refuel(this);
    }
}
