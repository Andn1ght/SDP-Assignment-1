public abstract class Vehicle {
    protected int fuelLevel;

    public Vehicle(int fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public abstract void refuel(RefuelingStrategy refuelingStrategy);
}
