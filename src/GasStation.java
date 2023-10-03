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
}
