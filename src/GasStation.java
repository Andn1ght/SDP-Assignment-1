/**
 * Represents a gas station that manages refueling of vehicles.
 */
public class GasStation {

    /**
     * The singleton instance of the GasStation class.
     */
    private static GasStation instance;

    /**
     * The refueling column for gasoline vehicles.
     */
    private RefuelingColumn gasolineColumn;

    /**
     * The refueling column for diesel vehicles.
     */
    private RefuelingColumn dieselColumn;

    /**
     * Constructs a GasStation with specified refueling columns.
     *
     * @param gasolineColumn The refueling column for gasoline vehicles.
     * @param dieselColumn   The refueling column for diesel vehicles.
     */
    public GasStation(RefuelingColumn gasolineColumn, RefuelingColumn dieselColumn) {
        this.gasolineColumn = gasolineColumn;
        this.dieselColumn = dieselColumn;
    }

    /**
     * Gets the gasoline refueling column.
     *
     * @return The gasoline refueling column.
     */
    public RefuelingColumn getGasolineColumn() {
        return gasolineColumn;
    }

    /**
     * Gets the diesel refueling column.
     *
     * @return The diesel refueling column.
     */
    public RefuelingColumn getDieselColumn() {
        return dieselColumn;
    }

    /**
     * Gets the singleton instance of the GasStation class.
     * If the instance does not exist, it is created with default columns.
     *
     * @return The singleton instance of GasStation.
     */
    public static GasStation getInstance() {
        if (instance == null) {
            // Create gasoline and diesel refueling columns with their respective strategies
            RefuelingColumn gasolineColumn = new GasolineColumn(new GasolineRefuelingStrategy());
            RefuelingColumn dieselColumn = new DieselColumn(new DieselRefuelingStrategy());

            // Create the GasStation instance with the refueling columns
            instance = new GasStation(gasolineColumn, dieselColumn);
        }
        return instance;
    }

    /**
     * Refuels a vehicle using the specified refueling column and amount.
     *
     * @param vehicle       The vehicle to be refueled.
     * @param column        The refueling column to use.
     * @param amountToRefuel The amount of fuel to refuel.
     */
    public void refuelVehicle(Vehicle vehicle, RefuelingColumn column, int amountToRefuel) {
        // Check if the selected vehicle type matches the column's supported strategy
        if ((vehicle instanceof GasolineVehicle && column instanceof GasolineColumn) ||
                (vehicle instanceof DieselVehicle && column instanceof DieselColumn)) {

            // Get the appropriate refueling strategy based on the vehicle type
            RefuelingStrategy refuelingStrategy = getRefuelingStrategy(vehicle);

            if (refuelingStrategy == null) {
                // If the vehicle type is unknown, throw an exception
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicle.getClass().getSimpleName());
            }

            // Refuel the vehicle using the specified column, strategy, and amount
            column.refuel(vehicle, refuelingStrategy, amountToRefuel);
        } else {
            // Throw an exception for incompatible vehicle and column
            throw new IllegalArgumentException("Incompatible vehicle type and refueling column.");
        }
    }


    /**
     * Determines the refueling strategy based on the vehicle type.
     *
     * @param vehicle The vehicle for which to determine the refueling strategy.
     * @return The refueling strategy based on the vehicle type.
     */
    private RefuelingStrategy getRefuelingStrategy(Vehicle vehicle) {
        if (vehicle instanceof GasolineVehicle) {
            // For gasoline vehicles, use the GasolineRefuelingStrategy
            return new GasolineRefuelingStrategy();
        } else if (vehicle instanceof DieselVehicle) {
            // For diesel vehicles, use the DieselRefuelingStrategy
            return new DieselRefuelingStrategy();
        } else {
            // If the vehicle type is not recognized, return null
            return null;
        }
    }
}
