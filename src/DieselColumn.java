/**
 * A refueling column for diesel-powered vehicles.
 */
public class DieselColumn implements RefuelingColumn {

    private RefuelingStrategy refuelingStrategy;

    /**
     * Constructs a diesel column with the specified refueling strategy.
     *
     * @param refuelingStrategy The refueling strategy to apply for diesel vehicles.
     */
    public DieselColumn(RefuelingStrategy refuelingStrategy) {
        this.refuelingStrategy = refuelingStrategy;
    }

    /**
     * Refuels the specified vehicle using the provided refueling strategy and amount of diesel fuel.
     *
     * @param vehicle           The vehicle to be refueled.
     * @param refuelingStrategy The refueling strategy to apply.
     * @param amountToRefuel    The amount of diesel fuel to refuel.
     */
    @Override
    public void refuel(Vehicle vehicle, RefuelingStrategy refuelingStrategy, int amountToRefuel) {
        refuelingStrategy.refuel(vehicle, amountToRefuel);
    }
}
