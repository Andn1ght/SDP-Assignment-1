/**
 * A refueling strategy for gasoline-powered vehicles.
 */
public class GasolineRefuelingStrategy implements RefuelingStrategy {

    /**
     * Refuels the specified gasoline vehicle with the given amount of gasoline.
     *
     * @param vehicle        The gasoline vehicle to be refueled.
     * @param amountToRefuel The amount of gasoline to refuel.
     * @throws IllegalArgumentException If the vehicle is not a gasoline vehicle.
     */
    @Override
    public void refuel(Vehicle vehicle, int amountToRefuel) {
        if (!(vehicle instanceof GasolineVehicle)) {
            throw new IllegalArgumentException("Vehicle cannot be refueled with gasoline: " + vehicle.getClass().getSimpleName());
        }

        // Cast the 'vehicle' parameter to a GasolineVehicle, assuming it is a gasoline-powered vehicle.
        GasolineVehicle gasolineVehicle = (GasolineVehicle) vehicle;

        // Increase the current fuel level of the gasoline vehicle by the specified amount.
        gasolineVehicle.setFuelLevel(gasolineVehicle.getFuelLevel() + amountToRefuel);
    }
}
