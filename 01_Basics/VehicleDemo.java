    interface Vehicle {
    void start();           // abstract
    void stop();            // abstract

    // Default method (Java 8+)
    default void fuelType() {
        System.out.println("Default fuel: Petrol");
    }

    // Static method (Java 8+)
    static void info() {
        System.out.println("Vehicle Interface — Java 8");
    }
}

class Car implements Vehicle {
    public void start() { System.out.println("Car started"); }
    public void stop()  { System.out.println("Car stopped"); }
}

class ElectricCar implements Vehicle {
    public void start() { System.out.println("Electric car started"); }
    public void stop()  { System.out.println("Electric car stopped"); }
    // Override default method
    public void fuelType() { System.out.println("Fuel type: Electric"); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle.info();
        Vehicle v1 = new Car();
        v1.start(); v1.fuelType(); v1.stop();
        System.out.println("---");
        Vehicle v2 = new ElectricCar();
        v2.start(); v2.fuelType(); v2.stop();
    }
}
