/*
17. Vehicle Speed Display
Scenario: Vehicle management system needs to display speed differently for different vehicle types.
Problem Statement:
Create class Vehicle with method displaySpeed(). Subclass Car and Bike override it.
Classes/Fields:
● Vehicle → displaySpeed() prints “Vehicle speed unknown”
● Car → overrides displaySpeed() → “Car speed 120 km/h”
● Bike → overrides displaySpeed() → “Bike speed 80 km/h”
*/
class Vehicle {
    public void displaySpeed() {
       System.out.println("Vehicle speed unknown");
    }
}

class Car extends Vehicle {
    @Override
    public void displaySpeed() {
      System.out.println("Car speed 120 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    public void displaySpeed() {
      System.out.println("Bike speed 80 km/h");
    }
}

public class VehicleSpeedDisplay {
    public static void main(String[] args) {
      Car car = new Car();
      Bike bike = new Bike();

      car.displaySpeed();
      bike.displaySpeed();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac VehicleSpeedDisplay.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java VehicleSpeedDisplay
Car speed 120 km/h
Bike speed 80 km/h
*/
