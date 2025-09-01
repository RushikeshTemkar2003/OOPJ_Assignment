/*
Problem 18:  Vehicle Registration – Static Counter 
Scenario: 
Create Vehicle class with regNo, ownerName, vehicleType. 
● Static variable: vehicleCount 
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount 
● Getter methods for all fields 
● Create 2 vehicles, display registration details 
*/
class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;
    static int vehicleCount = 1;

    Vehicle(String ownerName, String vehicleType) {
      this.regNo = "MH-2025-" + vehicleCount++;
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
    }

    String getRegNo() { return regNo; }
    String getOwnerName() { return ownerName; }
    String getVehicleType() { return vehicleType; }

    void display() {
        System.out.println("RegNo: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}

public class Problem18 {
    public static void main(String[] args) {
      Vehicle v1 = new Vehicle("Ravi", "Car");
      Vehicle v2 = new Vehicle("Sneha", "Bike");

      v1.display();
      v2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem18.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem18
RegNo: MH-2025-1, Owner: Ravi, Type: Car
RegNo: MH-2025-2, Owner: Sneha, Type: Bike
*/