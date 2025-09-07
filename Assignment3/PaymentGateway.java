/*
24. Payment Gateway
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All
payments must implement a pay() method.
Problem Statement:
● Create an interface Payment → method pay(double amount)
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay()
implementation
● In main(), take payment amount and process payment using both methods
*/
import java.util.Scanner;

interface Payment {
   void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
      System.out.println("Processing Credit Card Payment of " + amount);
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
     System.out.println("Processing PayPal Payment of " + amount);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter amount for Credit Card Payment: ");
      double creditAmount = sc.nextDouble();

      System.out.print("Enter amount for PayPal Payment: ");
      double paypalAmount = sc.nextDouble();

      Payment creditPayment = new CreditCardPayment();
      creditPayment.pay(creditAmount);

      Payment paypalPayment = new PayPalPayment();
      paypalPayment.pay(paypalAmount);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac PaymentGateway.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java PaymentGateway
Enter amount for Credit Card Payment: 1400
Enter amount for PayPal Payment: 2300
Processing Credit Card Payment of 1400.0
Processing PayPal Payment of 2300.0
*/
