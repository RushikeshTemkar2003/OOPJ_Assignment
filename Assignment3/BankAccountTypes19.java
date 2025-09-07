/*
19. Bank Account Types
Scenario: Bank manages different types of accounts: Savings and Current. Both share basic account
details, but Savings accounts have interest and Current accounts have overdraft limit.
Problem Statement:
Create a superclass BankAccount with:
● Fields: accountNumber, accountHolder, balance
● Method: displayBalance()
Create subclasses:
● SavingsAccount → field: interestRate, method: calculateInterest()
● CurrentAccount → field: overdraftLimit, method: checkOverdraft()
*/
class BankAccount {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
      this.accountNumber = accountNumber;
      this.accountHolder = accountHolder;
      this.balance = balance;
    }

    public void displayBalance() {
      System.out.println(accountHolder + " → Balance=" + (int)balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
      super(accountNumber, accountHolder, balance);
      this.interestRate = interestRate;
    }

    public void calculateInterest() {
      double interest = (balance * interestRate) / 100;
      System.out.println(accountHolder + " = Balance=" + (int)balance + ", Interest=" + (int)interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
      super(accountNumber, accountHolder, balance);
      this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft() {
      System.out.println(accountHolder + " = Balance=" + (int)balance + ", Overdraft Limit=" + (int)overdraftLimit);
    }
}

public class BankAccountTypes19 {
    public static void main(String[] args) {
      SavingsAccount sa = new SavingsAccount(101, "Ramesh", 5000, 5);
      CurrentAccount ca = new CurrentAccount(102, "Anita", 2000, 1000);

      sa.calculateInterest();
      ca.checkOverdraft();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac PaymentProcess.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac BankAccountTypes19.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java BankAccountTypes19
Ramesh = Balance=5000, Interest=250
Anita = Balance=2000, Overdraft Limit=1000
*/