/*
Problem 19:  Vehicle Registration – Static Block 
Scenario: 
Add a static block to Vehicle class: 
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads 
● Verify that the message prints only once when multiple vehicles are created
*/
class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;
    static int vehicleCount = 1;

    static {
      System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    Vehicle(String ownerName, String vehicleType) {
      this.regNo = "MH-2025-" + vehicleCount++;
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
    }

    void display() {
      System.out.println("RegNo: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}

public class Problem19{
    public static void main(String[] args) {
      Vehicle v1 = new Vehicle("Ravi", "Car");
      Vehicle v2 = new Vehicle("Sneha", "Bike");

      v1.display();
      v2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem19.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem19
Welcome to CDAC Vehicle Registration Portal
RegNo: MH-2025-1, Owner: Ravi, Type: Car
RegNo: MH-2025-2, Owner: Sneha, Type: Bike
*/