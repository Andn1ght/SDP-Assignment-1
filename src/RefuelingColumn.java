/**
 * Defines a column for refueling vehicles with a specific refueling strategy and amount of fuel.
 */
public interface RefuelingColumn {

    /**
     * Refuels the specified vehicle using the provided refueling strategy and amount of fuel.
     *
     * @param vehicle           The vehicle to be refueled.
     * @param refuelingStrategy The refueling strategy to apply.
     * @param amountToRefuel    The amount of fuel to refuel.
     */
    void refuel(Vehicle vehicle, RefuelingStrategy refuelingStrategy, int amountToRefuel);
}
