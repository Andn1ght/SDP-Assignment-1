/**
 * Represents a vehicle with a fuel level that can be refueled using a specific strategy.
 */
public abstract class Vehicle {

    /**
     * The current fuel level of the vehicle.
     */
    private int fuelLevel;

    /**
     * Constructs a vehicle with the specified initial fuel level.
     *
     * @param fuelLevel The initial fuel level of the vehicle.
     */
    public Vehicle(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    /**
     * Gets the current fuel level of the vehicle.
     *
     * @return The current fuel level.
     */
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Sets the fuel level of the vehicle to a new value.
     *
     * @param fuelLevel The new fuel level to set.
     */
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    /**
     * Refuels the vehicle using the specified refueling strategy and amount.
     *
     * @param refuelingStrategy The refueling strategy to apply.
     * @param amountToRefuel    The amount of fuel to refuel.
     */
    public abstract void refuel(RefuelingStrategy refuelingStrategy, int amountToRefuel);
}
