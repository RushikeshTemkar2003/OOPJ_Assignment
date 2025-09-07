/*
18. Payment Process
Scenario: Company wants to process payments differently depending on mode of payment, but handle all
payments through a single reference.
Problem Statement:
Create abstract class Payment with abstract method pay(). Subclass CreditCardPayment and UPIPayment
implement pay().
Usage:
● Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...)
● Call p.pay() for runtime polymorphic behavior
*/
abstract class Payment {
    public abstract void pay();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private double amount;

    public CreditCardPayment(String cardNumber, double amount) {
       this.cardNumber = cardNumber;
       this.amount = amount;
    }

    @Override
    public void pay() {
       System.out.println("Payment via Credit Card " + cardNumber + " , Rs. " + (int)amount + " Paid");
    }
}

class UPIPayment extends Payment {
    private String upiId;
    private double amount;

    public UPIPayment(String upiId, double amount) {
       this.upiId = upiId;
       this.amount = amount;
    }

    @Override
    public void pay() {
       System.out.println("Payment via UPI " + upiId + " , Rs. " + (int)amount + " Paid");
    }
}

public class PaymentProcess {
    public static void main(String[] args) {
      Payment p;

      p = new CreditCardPayment("1234567890123456", 5000);
      p.pay();

      p = new UPIPayment("rahul@upi", 2000);
      p.pay();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac PaymentProcess.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java PaymentProcess
Payment via Credit Card 1234567890123456 , Rs. 5000 Paid
Payment via UPI rahul@upi , Rs. 2000 Paid
*/
