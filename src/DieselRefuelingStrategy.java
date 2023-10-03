/**
 * A refueling strategy for diesel-powered vehicles.
 */
public class DieselRefuelingStrategy implements RefuelingStrategy {

    /**
     * Refuels the specified diesel vehicle with the given amount of diesel fuel.
     *
     * @param vehicle        The diesel vehicle to be refueled.
     * @param amountToRefuel The amount of diesel fuel to refuel.
     * @throws IllegalArgumentException If the vehicle is not a diesel vehicle.
     */
    @Override
    public void refuel(Vehicle vehicle, int amountToRefuel) {
        if (!(vehicle instanceof DieselVehicle)) {
            throw new IllegalArgumentException("Vehicle cannot be refueled with diesel: " + vehicle.getClass().getSimpleName());
        }

        // Cast the 'vehicle' parameter to a DieselVehicle, assuming it is a diesel-powered vehicle.
        DieselVehicle dieselVehicle = (DieselVehicle) vehicle;

        // Increase the current fuel level of the diesel vehicle by the specified amount.
        dieselVehicle.setFuelLevel(dieselVehicle.getFuelLevel() + amountToRefuel);
    }
}
