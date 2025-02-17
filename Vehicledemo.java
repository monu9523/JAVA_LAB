class Vehicle {
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    int numDoors;
    String fuelType;

    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Vehicledemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 2022, 4, "Petrol");
        myCar.displayInfo();
    }
}
