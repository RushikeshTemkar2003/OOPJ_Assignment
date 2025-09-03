/*
Problem 12: Bank Account Basic Info 
Scenario: 
Create BankAccount class with accountHolder and balance. 
● Use parameterized constructor to initialize account. 
● Create getter and setter for balance. 
● In main, create one account and display details. 
*/
class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
      this.accountHolder = accountHolder;
      this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    void display() {
       System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class Problem12 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Amit", 20000);
        acc.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem12.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem12
Account Holder: Amit, Balance: 20000.0
*/