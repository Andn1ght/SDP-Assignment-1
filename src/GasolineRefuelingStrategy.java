public class GasolineRefuelingStrategy implements RefuelingStrategy{

    @Override
    public void refuel(Vehicle vehicle) {
        if (!(vehicle instanceof GasolineVehicle)) {
            throw new IllegalArgumentException("Vehicle cannot be refueled with gasoline: " + vehicle.getClass().getName());
        }

        GasolineVehicle gasolineVehicle = (GasolineVehicle) vehicle;
        gasolineVehicle.setFuelLevel(gasolineVehicle.getFuelLevel() + 10);
    }
}
