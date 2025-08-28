/*
3. Bank Transaction Check 
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a 
deposit (positive) or a withdrawal (negative). 
Input: 
Enter transaction amount: -2500 
Output: 
Withdrawal transaction.
*/
import java.util.Scanner;

class Q3_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter transaction amount: ");
        int amount = sc.nextInt();

        if (amount > 0) {
            System.out.println("Deposit transaction.");
        } else if (amount < 0) {
            System.out.println("Withdrawal transaction.");
        } else {
            System.out.println("No transaction.");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q3_Bank.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q3_Bank
Enter transaction amount: 2500
Deposit transaction.
*/