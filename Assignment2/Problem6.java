/*
Scenario: 
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and 
age or name, age, and seat type. The system should also count the total tickets booked using a static 
counter. 
Tasks: 
1. Create a Passenger class. 
2. Implement two constructors (constructor overloading): 
Constructor 1 → Passenger(String name, int age) 
Constructor 2 → Passenger(String name, int age, String seatType) 
3. Use a static counter to keep track of total passengers booked. 
4. Print passenger details and total passengers. 
*/
class Passenger {
    private String name;
    private int age;
    private String seatType;
    private static int totalPassengers = 0;

    public Passenger(String name, int age) {
       this.name = name;
       this.age = age;
       this.seatType = "General"; // Default seat
       totalPassengers++;
    }

    public Passenger(String name, int age, String seatType) {
      this.name = name;
      this.age = age;
      this.seatType = seatType;
      totalPassengers++;
    }

    public void showDetails() {
      	System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }

    public static void showTotalPassengers() {
       System.out.println("Total Passengers Booked: " + totalPassengers);
    }
}

public class Problem6 {
    public static void main(String[] args) {
      Passenger p1 = new Passenger("Ravi", 25);
      Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
	  Passenger p3 = new Passenger("Suresh", 40);

       System.out.print("Passenger1: "); p1.showDetails();
       System.out.print("Passenger2: "); p2.showDetails();
       System.out.print("Passenger3: "); p3.showDetails();
       Passenger.showTotalPassengers();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem6.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem6
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers Booked: 3
*/