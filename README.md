# Gas Station Simulator

This project is a simulation of a gas station where vehicles can refuel using different types of fuel. The simulation incorporates the `Singleton` and `Strategy` design patterns and adheres to **SOLID, DRY (Don't Repeat Yourself),** and **KISS (Keep It Simple, Stupid)** principles.

## Table of Contents

- [Introduction](#introduction)
- [Design Patterns](#design-patterns)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [SOLID Principles](#solid-principles)
- [DRY Principle](#dry-principle)
- [KISS Principle](#kiss-principle)

## Introduction

*Imagine a gas station where vehicles, such as cars and trucks, can refuel with various types of fuel, including gasoline and diesel. The gas station has multiple refueling columns, each supporting specific fuel types. Vehicles can choose any available column for refueling, but the compatibility of the vehicle's engine with the selected fuel type is ensured.*

## Design Patterns

This project implements two design patterns:

- **Singleton Pattern**: The `GasStation` class is designed as a Singleton to ensure that only one instance of the gas station exists throughout the application.
 ```
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
  ```
- **Strategy Pattern**: The refueling mechanism is implemented using the Strategy pattern. Different vehicle types (GasolineVehicle and DieselVehicle) have corresponding refueling strategies (GasolineRefuelingStrategy and DieselRefuelingStrategy). The gas station selects the appropriate strategy based on the vehicle type.

## Project Structure

The project is organized into several classes and interfaces:

- `GasStation`: Represents the gas station and provides a Singleton instance. It manages the refueling of vehicles.

- `RefuelingStrategy`: An interface defining the refueling strategy. Implemented by `GasolineRefuelingStrategy` and `DieselRefuelingStrategy`.

- `RefuelingColumn`: An interface representing a refueling column. Implemented by `GasolineColumn` and `DieselColumn`.

- `Vehicle`: An abstract class representing vehicles. Extended by `GasolineVehicle` and `DieselVehicle`.

## Usage

In the simulation, you can create vehicles, choose a refueling column, and specify the amount of fuel to refuel. The simulation will ensure that the selected column and fuel type are compatible with the chosen vehicle.

## SOLID Principles

- **Single Responsibility Principle (SRP)**: Each class in the project has a single responsibility. For example, the `GasStation` class is responsible for managing the gas station, while refueling strategies and columns handle their respective tasks.

- **Open/Closed Principle (OCP)**: The project is designed to be open for extension (e.g., adding new vehicle types) but closed for modification. New vehicle types can be added by creating new classes without modifying existing code.

- **Liskov Substitution Principle (LSP)**: The project follows the LSP by allowing derived classes (`GasolineVehicle` and `DieselVehicle`) to be substituted for their base class (`Vehicle`) without affecting the correctness of the program.

- **Interface Segregation Principle (ISP)**: The interfaces (`RefuelingStrategy` and `RefuelingColumn`) are designed to be minimal and specific to their clients, adhering to the ISP.

- **Dependency Inversion Principle (DIP)**: High-level modules (`GasStation`) depend on abstractions (`RefuelingStrategy` and `RefuelingColumn`) rather than concrete implementations, adhering to the DIP.

## DRY Principle

The project follows the **DRY (Don't Repeat Yourself)** principle by minimizing code duplication. Reusable components, such as refueling strategies and columns, are abstracted into separate classes and interfaces, promoting code reusability.

## KISS Principle

The project adheres to the **KISS (Keep It Simple, Stupid)** principle by maintaining simplicity and readability in the code. Class and method names are clear and concise, and the project's structure is straightforward, making it easy to understand and maintain.

