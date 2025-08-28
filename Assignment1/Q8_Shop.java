/*
8. Shop Discount Calculation 
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount 
as input and calculate final cost. 
Input: 
Enter total purchase amount: 1200 
Output: 
Final cost after discount: 1080 
*/
import java.util.Scanner;

class Q8_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();
        double finalCost = amount;

        if (amount > 1000) {
            finalCost = amount - (amount * 0.10);
        }

        System.out.println("Final cost after discount: " + finalCost);
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q8_Shop.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q8_Shop
Enter total purchase amount: 250
Final cost after discount: 250.0

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q8_Shop
Enter total purchase amount: 1200
Final cost after discount: 1080.0
*/