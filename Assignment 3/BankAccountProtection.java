/*
1. Bank Account Protection
Scenario: You are creating a simple banking system. A user should not be able to directly change their
balance.
Problem Statement:
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance.
Class/Fields:
● private double balance
Methods:
● deposit(double amount) → add to balance
● withdraw(double amount) → subtract from balance if sufficient
● getBalance() → returns current balance

*/
class BankAccount {
    private double balance;
	
	public BankAccount(){
		balance = 0.0;
	}

    public void deposit(double amount) {
        if (amount > 0) {
          balance = balance + amount;
       } else {
          System.out.println("Deposit amount must be positive.");
       }
   }
    public void withdraw(double amount) {
        if (amount < = balance) {
           balance = balance - amount;
       } else {
           System.out.println("Insufficient balance. Withdrawal denied.");
       }
   }
    public double getBalance() {
        return balance;
    }
}
public class BankAccountProtection {
    public static void main(String[] args) {
	  BankAccount account = new BankAccount();
      account.deposit(5000);
	  account.withdraw(2000);
      System.out.println("Updated Balance = " + account.getBalance());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac BankAccountProtection.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java BankAccountProtection
Updated Balance = 3000.0
*/
