public class GasolineRefuelingStrategy implements RefuelingStrategy {
    @Override
    public void refuel(Vehicle vehicle, int amountToRefuel) {
        if (!(vehicle instanceof GasolineVehicle)) {
            throw new IllegalArgumentException("Vehicle cannot be refueled with gasoline: " + vehicle.getClass().getSimpleName());
        }

        GasolineVehicle gasolineVehicle = (GasolineVehicle) vehicle;
        gasolineVehicle.setFuelLevel(gasolineVehicle.getFuelLevel() + amountToRefuel);
    }
}
