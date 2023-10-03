/**
 * Represents a diesel-powered vehicle that can be refueled using a specific strategy.
 */
public class DieselVehicle extends Vehicle {

    /**
     * Constructs a diesel vehicle with the specified initial fuel level.
     *
     * @param fuelLevel The initial fuel level of the diesel vehicle.
     */
    public DieselVehicle(int fuelLevel) {
        super(fuelLevel);
    }

    /**
     * Refuels the diesel vehicle using the specified refueling strategy and amount.
     *
     * @param refuelingStrategy The refueling strategy to apply.
     * @param amountToRefuel    The amount of diesel fuel to refuel.
     */
    @Override
    public void refuel(RefuelingStrategy refuelingStrategy, int amountToRefuel) {
        refuelingStrategy.refuel(this, amountToRefuel);
    }
}

