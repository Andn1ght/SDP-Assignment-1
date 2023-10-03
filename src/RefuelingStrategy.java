/**
 * Defines a strategy for refueling a vehicle with a specific amount of fuel.
 */
public interface RefuelingStrategy {

    /**
     * Refuels the specified vehicle with the given amount of fuel.
     *
     * @param vehicle       The vehicle to be refueled.
     * @param amountToRefuel The amount of fuel to refuel.
     */
    void refuel(Vehicle vehicle, int amountToRefuel);
}
