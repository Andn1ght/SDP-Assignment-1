public class Main {
    public static void main(String[] args) {
        // Create a GasStation instance (Singleton)
        GasStation gasStation = GasStation.getInstance();

        // Create some vehicles
        GasolineVehicle car1 = new GasolineVehicle("Toyota", "Camry", 2020, 30);
        DieselVehicle truck1 = new DieselVehicle(50);
        GasolineVehicle car2 = new GasolineVehicle("Honda", "Civic", 2019, 25);

        // Refuel vehicles
        gasStation.refuel(car1);
        gasStation.refuel(truck1);
        gasStation.refuel(car2);

        // Check fuel levels after refueling
        System.out.println("Car 1 Fuel Level: " + car1.getFuelLevel());
        System.out.println("Truck 1 Fuel Level: " + truck1.getFuelLevel());
        System.out.println("Car 2 Fuel Level: " + car2.getFuelLevel());
    }
}
