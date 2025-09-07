/*12. Payment System
Scenario: A company accepts different payment modes.
Problem Statement:
Create an abstract class Payment with abstract method pay(). Create subclasses CreditCardPayment and
UPIPayment that implement pay().
Classes/Fields:
● Payment → pay() (abstract)
● CreditCardPayment → cardNumber, amount
● UPIPayment → upiId, amount
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
       System.out.println("Payment via Credit Card " + cardNumber + " = Rs. " + (int)amount + " Paid");
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
       System.out.println("Payment via UPI " + upiId + " = Rs. " + (int)amount + " Paid");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
       CreditCardPayment credit = new CreditCardPayment("1234567890123456", 5000);
       UPIPayment upi = new UPIPayment("rahul@upi", 2000);

       credit.pay();
       upi.pay();
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac PaymentSystem.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java PaymentSystem
Payment via Credit Card 1234567890123456 = Rs. 5000 Paid
Payment via UPI rahul@upi = Rs. 2000 Paid
*/