/**
 * A refueling column for gasoline-powered vehicles.
 */
public class GasolineColumn implements RefuelingColumn {

    private RefuelingStrategy refuelingStrategy;

    /**
     * Constructs a gasoline column with the specified refueling strategy.
     *
     * @param refuelingStrategy The refueling strategy to apply for gasoline vehicles.
     */
    public GasolineColumn(RefuelingStrategy refuelingStrategy) {
        this.refuelingStrategy = refuelingStrategy;
    }

    /**
     * Refuels the specified vehicle using the provided refueling strategy and amount of gasoline.
     *
     * @param vehicle           The vehicle to be refueled.
     * @param refuelingStrategy The refueling strategy to apply.
     * @param amountToRefuel    The amount of gasoline to refuel.
     */
    @Override
    public void refuel(Vehicle vehicle, RefuelingStrategy refuelingStrategy, int amountToRefuel) {
        refuelingStrategy.refuel(vehicle, amountToRefuel);
    }
}
