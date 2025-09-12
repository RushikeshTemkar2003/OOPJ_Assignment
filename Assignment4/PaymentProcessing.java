/*
Problem 25: Payment Processing
Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to
convert them to integers for financial calculations.
Task: Parse string input to integer and perform calculations.
*/
public class PaymentProcessing {

  public static void main(String[] args) {

    String amountStr = "1000";
    int addAmount = 500;
    int amount = Integer.parseInt(amountStr);

    int total = amount + addAmount;

    System.out.println(amount + " + " + addAmount + " = " + total);

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac PaymentProcessing.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java PaymentProcessing
1000 + 500 = 1500
*/
