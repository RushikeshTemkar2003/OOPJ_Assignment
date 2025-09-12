/*
Problem 8: Payment Processing
Scenario: A payment gateway system processes transactions and needs to clean up database connections
(just a scenario, database knowledge not required) regardless of whether the payment succeeds or fails.
Task: Create a payment processing method that uses finally block for cleanup operations.
*/
public class PaymentGateway {

 public static void main(String[] args) {

  processPayment();

 }

 static void processPayment() {

  try {
   System.out.println("Processing payment...");

   throw new Exception("Payment failed");

  } catch(Exception e){
   System.out.println("Exception occurred: " + e.getMessage());
  }

  finally {
   System.out.println("Cleanup done");
  }

 }

}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac PaymentGateway.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java PaymentGateway
Processing payment...
Exception occurred: Payment failed
Cleanup done

*/