/*
Problem 18: Ticket Number Verification
Scenario: A ticketing system generates verification codes by reversing ticket numbers for security
purposes.
Task: Use StringBuffer to create verification codes.
*/
public class TicketVerification {

  public static void main(String[] args) {

    String ticketNumber = "12345";

    StringBuffer sb = new StringBuffer(ticketNumber);

    sb.reverse();

    System.out.println(sb.toString());

  }

}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac  TicketVerification.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java  TicketVerification
54321
*/
