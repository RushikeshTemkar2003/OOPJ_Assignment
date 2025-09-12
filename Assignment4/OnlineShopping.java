/*
Problem 5: Online Shopping
Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price).
The system needs to handle invalid quantities and accessing non-existent products.
Task: Create an order processing method that handles multiple exception types.

*/
public class OnlineShopping {

 public static void main(String[] args) {

  try {
   int quantity = 0;
   int numberOfProducts = 3;
   double prices[] = {299.99, 499.99, 199.99};
   int productIndex = 5;

   double total = quantity * prices[productIndex];

   System.out.println("Total Price: " + total);

  } catch(ArithmeticException e){
   System.out.println("Arithmetic Exception caught");
  }

  catch(ArrayIndexOutOfBoundsException e){
   System.out.println("Array Index Exception");
  }

  catch(Exception e){
   System.out.println("Some other exception");
  }

 }

}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac OnlineShopping.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java OnlineShopping
Array Index Exception

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>
*/