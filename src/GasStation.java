public class GasStation {

    private static GasStation instance;
    private RefuelingColumn gasolineColumn;
    private RefuelingColumn dieselColumn;

    public GasStation(RefuelingColumn gasolineColumn, RefuelingColumn dieselColumn) {
        this.gasolineColumn = gasolineColumn;
        this.dieselColumn = dieselColumn;
    }

    public RefuelingColumn getGasolineColumn() {
        return gasolineColumn;
    }

    public RefuelingColumn getDieselColumn() {
        return dieselColumn;
    }

    public static GasStation getInstance() {
        if (instance == null) {
            RefuelingColumn gasolineColumn = new GasolineColumn(new GasolineRefuelingStrategy());
            RefuelingColumn dieselColumn = new DieselColumn(new DieselRefuelingStrategy());
            instance = new GasStation(gasolineColumn, dieselColumn);
        }
        return instance;
    }

    public void refuelVehicle(Vehicle vehicle, RefuelingColumn column, int amountToRefuel) {
        RefuelingStrategy refuelingStrategy = getRefuelingStrategy(vehicle);
        if (refuelingStrategy == null) {
            throw new IllegalArgumentException("Unknown vehicle type: " + vehicle.getClass().getSimpleName());
        }

        // Refuel the vehicle using the specified column and amount
        column.refuel(vehicle, refuelingStrategy, amountToRefuel);
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