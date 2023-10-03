public class GasStation {

    private static GasStation instance;
    private RefuelingColumn gasolineColumn;
    private RefuelingColumn dieselColumn;

    public GasStation(RefuelingColumn gasolineColumn, RefuelingColumn dieselColumn) {
        this.gasolineColumn = gasolineColumn;
        this.dieselColumn = dieselColumn;
    }

    public static GasStation getInstance() {
        if (instance == null) {
            instance = new GasStation(new GasolineColumn(), new DieselColumn());
        }
        return instance;
    }

    public void refuel(Vehicle vehicle) {
        RefuelingStrategy refuelingStrategy = getRefuelingStrategy(vehicle);
        if (refuelingStrategy == null) {
            throw new IllegalArgumentException("Unknown vehicle type: " + vehicle.getClass().getName());
        }

        refuelingStrategy.refuel(vehicle);
    }

    private RefuelingStrategy getRefuelingStrategy(Vehicle vehicle) {
        if (vehicle instanceof GasolineVehicle) {
            return new GasolineRefuelingStrategy();
        } else if (vehicle instanceof DieselVehicle) {
            return new DieselRefuelingStrategy();
        } else {
            return null;
        }
    }
}