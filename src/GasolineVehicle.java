/**
 * Represents a gasoline-powered vehicle that can be refueled using a specific strategy.
 */
public class GasolineVehicle extends Vehicle {

    /**
     * Constructs a gasoline vehicle with the specified initial fuel level.
     *
     * @param fuelLevel The initial fuel level of the gasoline vehicle.
     */
    public GasolineVehicle(int fuelLevel) {
        super(fuelLevel);
    }

    /**
     * Refuels the gasoline vehicle using the specified refueling strategy and amount.
     *
     * @param refuelingStrategy The refueling strategy to apply.
     * @param amountToRefuel    The amount of gasoline to refuel.
     */
    @Override
    public void refuel(RefuelingStrategy refuelingStrategy, int amountToRefuel) {
        refuelingStrategy.refuel(this, amountToRefuel);
    }
}
