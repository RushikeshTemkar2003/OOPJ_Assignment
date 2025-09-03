/*
Problem 13: Bank Deposit & Withdrawal 
Scenario: 
Extend previous problem. Add methods: 
● deposit(double amount) → adds to balance 
● withdraw(double amount) → subtracts from balance 
● Create two accounts, perform deposit/withdraw, display updated balance. 
*/
class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
     this.accountHolder = accountHolder;
     this.balance = balance;
    }

    void deposit(double amount) {
      balance += amount;
      System.out.println(accountHolder + " deposited " + amount + ". New Balance: " + balance);
    }

    void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
          System.out.println(accountHolder + " withdrew " + amount + ". New Balance: " + balance);
      } else {
          System.out.println("Insufficient balance!");
       }
    }

    void display() {
       System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class Problem13 {
    public static void main(String[] args) {
      BankAccount acc1 = new BankAccount("Rohit", 5000);
      BankAccount acc2 = new BankAccount("Priya", 10000);

      acc1.deposit(2000);
      acc1.withdraw(1000);

      acc2.withdraw(3000);
      acc2.deposit(1500);

      acc1.display();
      acc2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem13.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem13
Rohit deposited 2000.0. New Balance: 7000.0
Rohit withdrew 1000.0. New Balance: 6000.0
Priya withdrew 3000.0. New Balance: 7000.0
Priya deposited 1500.0. New Balance: 8500.0
Account Holder: Rohit, Balance: 6000.0
Account Holder: Priya, Balance: 8500.0
*/