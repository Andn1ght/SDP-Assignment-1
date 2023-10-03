public class GasolineColumn implements RefuelingColumn {
    private RefuelingStrategy refuelingStrategy;

    public GasolineColumn(RefuelingStrategy refuelingStrategy) {
        this.refuelingStrategy = refuelingStrategy;
    }

    @Override
    public void refuel(Vehicle vehicle, RefuelingStrategy refuelingStrategy, int amountToRefuel) {
        refuelingStrategy.refuel(vehicle, amountToRefuel);
    }
}
