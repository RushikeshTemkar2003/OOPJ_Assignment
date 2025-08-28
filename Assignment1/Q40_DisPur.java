/*
40. Discount on Purchase (Ternary) 
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total 
cost using ternary.  

Input: 
Enter purchase amount: 1200 

Output: 
Total cost after discount: 1080 
*/

import java.util.Scanner;

class Q40_DisPur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double total = (amount > 1000) ? (amount - (amount * 0.10)) : amount;
        System.out.println("Total cost after discount: " + total);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q40_DisPur.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q40_DisPur
Enter purchase amount: 2400
Total cost after discount: 2160.0
*/