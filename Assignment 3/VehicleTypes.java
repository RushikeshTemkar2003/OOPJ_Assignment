/*
8. Vehicle Types
Scenario: You want to categorize vehicles.
Problem Statement:
Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType.
Display details of each vehicle.
Classes/Fields:
● Vehicle → brand, speed
● Car → modelType
● Bike → modelType
*/
class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
       this.brand = brand;
       this.speed = speed;
    }

    public String getDetails() {
       return brand + ", Speed=" + speed;
    }
}

class Car extends Vehicle {
    private String modelType;

    public Car(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    @Override
    public String getDetails() {
        return "Car = " + brand + " " + modelType + ", Speed=" + speed;
    }
}

class Bike extends Vehicle {
    private String modelType;

    public Bike(String brand, int speed, String modelType) {
       super(brand, speed);
       this.modelType = modelType;
    }

    @Override
    public String getDetails() {
       return "Bike = " + brand + " " + modelType + ", Speed=" + speed;
    }
}

public class VehicleTypes {
    public static void main(String[] args) {
       Car car = new Car("Honda", 180, "Civic");
       Bike bike = new Bike("Yamaha", 120, "R15");

       System.out.println(car.getDetails());
       System.out.println(bike.getDetails());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac VehicleTypes.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java VehicleTypes
Car = Honda Civic, Speed=180
Bike = Yamaha R15, Speed=120
*/