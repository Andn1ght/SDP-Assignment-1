public class DieselRefuelingStrategy implements RefuelingStrategy {
    @Override
    public void refuel(Vehicle vehicle, int amountToRefuel) {
        if (!(vehicle instanceof DieselVehicle)) {
            throw new IllegalArgumentException("Vehicle cannot be refueled with diesel: " + vehicle.getClass().getSimpleName());
        }

        DieselVehicle dieselVehicle = (DieselVehicle) vehicle;
        dieselVehicle.setFuelLevel(dieselVehicle.getFuelLevel() + amountToRefuel);
    }
}
