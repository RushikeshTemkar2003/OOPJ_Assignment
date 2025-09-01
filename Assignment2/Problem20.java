/*
Problem 20: Ticket Booking System 
Question: 
Create a class Ticket with: 
● passengerName (instance) 
● ticketNo (instance, auto-generated using a static counter starting from 5001) 
● Constructor to accept passengerName 
● Method displayTicket() to show ticket details 
*/
class Ticket {
    String passengerName;
    int ticketNo;
    static int counter = 5001;

    Ticket(String passengerName) {
      this.passengerName = passengerName;
      this.ticketNo = counter++;
    }

    void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }
}

public class Problem20 {
    public static void main(String[] args) {
      Ticket t1 = new Ticket("Rahul");
      Ticket t2 = new Ticket("Priya");
      Ticket t3 = new Ticket("Amit");

      t1.displayTicket();
      t2.displayTicket();
      t3.displayTicket();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem20.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem20
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit
*/