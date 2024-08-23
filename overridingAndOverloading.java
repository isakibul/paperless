/*
 * parent class - vehicle
 */
class Vehicle {
    String model;

    /*
     * constructor for the Vehicle class
     */
    Vehicle(String model) {
        this.model = model;
    }

    void startEngine() {
        System.out.println("The engine of the vehicle is starting.");
    }

    /*
     * overloaded method
     */
    void refuel(int liters) {
        System.out.println("Refueled " + liters + " liters.");
    }
    void refuel(String fuelType, int liters) {
        System.out.println("Refueled " + liters + " liters of " + fuelType + ".");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String model, int doors) {
        super(model);
        this.doors = doors;
    }

    /*
     * overriding the startEngine method
     */
    @Override
    void startEngine() {
        System.out.println("The engine of the car (" + this.model + ") is starting with a roar.");
    }

    /*
     * overloading the refuel method in the Car class
     */
    void refuel(boolean premiumFuel) {
        if (premiumFuel) {
            System.out.println("Refueled with premium fuel.");
        } else {
            System.out.println("Refueled with regular fuel.");
        }
    }

    void displayCarInfo() {
        System.out.println("Car Model: " + this.model + ", Doors: " + this.doors);
    }
}

public class overridingAndOverloading {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("Generic Model");
        genericVehicle.startEngine();
        genericVehicle.refuel(50);
        genericVehicle.refuel("Diesel", 40);

        /*
         * creating an instance of the Car class
         */
        Car myCar = new Car("Toyota Camry", 4);
        myCar.startEngine();
        myCar.refuel(true);
        myCar.refuel(40);
        myCar.refuel("Petrol", 30);
        myCar.displayCarInfo();
    }
}
