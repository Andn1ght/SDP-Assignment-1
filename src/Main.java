import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a GasStation instance (Singleton)
        GasStation gasStation = GasStation.getInstance();

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for column choice
        System.out.println("Choose a column to refuel:");
        System.out.println("1. Gasoline Column");
        System.out.println("2. Diesel Column");

        int columnChoice = scanner.nextInt();
        RefuelingColumn selectedColumn = null;

        switch (columnChoice) {
            case 1:
                selectedColumn = gasStation.getGasolineColumn();
                break;
            case 2:
                selectedColumn = gasStation.getDieselColumn();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (selectedColumn != null) {
            // Create some vehicles
            GasolineVehicle car1 = new GasolineVehicle(30);
            DieselVehicle truck1 = new DieselVehicle(50);
            GasolineVehicle car2 = new GasolineVehicle(25);

            // Prompt the user for vehicle choice
            System.out.println("Choose a vehicle to refuel:");
            System.out.println("1. Car 1");
            System.out.println("2. Truck 1");
            System.out.println("3. Car 2");

            int vehicleChoice = scanner.nextInt();
            Vehicle selectedVehicle = null;

            switch (vehicleChoice) {
                case 1:
                    selectedVehicle = car1;
                    break;
                case 2:
                    selectedVehicle = truck1;
                    break;
                case 3:
                    selectedVehicle = car2;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            if (selectedVehicle != null) {
                System.out.println("Enter the amount of gas to refuel:");
                int amountToRefuel = scanner.nextInt();

                // Refuel the selected vehicle with the chosen column, strategy, and amount
                gasStation.refuelVehicle(selectedVehicle, selectedColumn, amountToRefuel);

                // Check the fuel level after refueling
                System.out.println(selectedVehicle.getClass().getSimpleName() + " Fuel Level: " + selectedVehicle.getFuelLevel());
            }
        }

        // Close the scanner
        scanner.close();
    }
}
