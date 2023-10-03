public class DieselRefuelingStrategy implements RefuelingStrategy {

    @Override
    public void refuel(Vehicle vehicle) {
        if (!(vehicle instanceof DieselVehicle)) {
            throw new IllegalArgumentException("Vehicle cannot be refueled with diesel: " + vehicle.getClass().getName());
        }

        DieselVehicle dieselVehicle = (DieselVehicle) vehicle;
        dieselVehicle.setFuelLevel(dieselVehicle.getFuelLevel() + 10);
    }
}
