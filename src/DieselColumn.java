public class DieselColumn implements RefuelingColumn{

    @Override
    public void refuel(Vehicle vehicle, RefuelingStrategy refuelingStrategy) {
        refuelingStrategy.refuel(vehicle);
    }
}
