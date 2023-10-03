public class GasolineColumn implements RefuelingColumn{

    @Override
    public void refuel(Vehicle vehicle, RefuelingStrategy refuelingStrategy) {
        refuelingStrategy.refuel(vehicle);
    }
}
