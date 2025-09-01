/*
Problem 7: Indian Movie Ticket Booking 
Scenario: 
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with 
ticket type. Keep track of total tickets sold using a static counter. 
Tasks: 
1. Create a Customer class. 
2. Implement two constructors: 
Constructor 1 → Customer(String name) 
Constructor 2 → Customer(String name, String ticketType) 
3. Static counter to track tickets sold. 
4. Print customer details and total tickets sold
*/
class Customer {
    String name;
    String ticketType;
    static int ticketCount = 0;

    Customer(String name) {
       this.name = name;
       this.ticketType = "Normal"; // default
       ticketCount++;
    }

    Customer(String name, String ticketType) {
       this.name = name;
       this.ticketType = ticketType;
       ticketCount++;
    }

    void display() {
        System.out.println("Name: " + name + ", Ticket: " + ticketType);
    }
}

public class Problem7 {
    public static void main(String[] args) {
      Customer c1 = new Customer("Rahul");
      Customer c2 = new Customer("Pooja", "Premium");
      Customer c3 = new Customer("Amit");

      c1.display();
      c2.display();
      c3.display();
	  System.out.println("Total Tickets Sold: " + Customer.ticketCount);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem7.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem7
Name: Rahul, Ticket: Normal
Name: Pooja, Ticket: Premium
Name: Amit, Ticket: Normal
Total Tickets Sold: 3
*/