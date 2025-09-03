/*
Problem 14: Bank Name Display 
Scenario: 
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to 
BankAccount. 
● Call displayBankName() from main. 
● Create one account to verify instance creation.
*/
class BankAccount {
    private String accountHolder;
    private double balance;
    private static String bankName = "CDAC Bank";

    BankAccount(String accountHolder, double balance) {
      this.accountHolder = accountHolder;
      this.balance = balance;
    }

    static void displayBankName() {
      System.out.println("Bank Name: " + bankName);
    }

    void display() {
      System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class Problem14 {
    public static void main(String[] args) {
      BankAccount.displayBankName();

      BankAccount acc = new BankAccount("Amit", 20000);
      acc.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem14.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem14
Bank Name: CDAC Bank
Account Holder: Amit, Balance: 20000.0
*/