/*
Problem 13: Order Number Display
Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order
for verification purposes.
Task: Use StringBuilder to reverse order numbers
*/
public class OrderNumber {

  public static void main(String[] args) {

    String orderNum = "INV2025";

    StringBuilder sb = new StringBuilder(orderNum);

    sb.reverse();

    System.out.println(sb.toString());

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac OrderNumber.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java OrderNumber
5202VNI
*/
