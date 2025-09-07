/*
11. Bank Account Types
Scenario: Bank provides different account types.
Problem Statement:
Superclass Account → accountNo, balance. Subclass SavingAccount → interestRate. Subclass
CurrentAccount → overdraftLimit. Display account details.
Classes/Fields:
● Account → accountNo, balance
● SavingAccount → interestRate
● CurrentAccount → overdraftLimit
*/
class Account {
    protected int accountNo;
    protected double balance;

    public Account(int accountNo, double balance) {
       this.accountNo = accountNo;
       this.balance = balance;
    }

    public String getDetails() {
       return accountNo + ", Balance=" + (int)balance;
    }
}

class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accountNo, double balance, double interestRate) {
       super(accountNo, balance);
       this.interestRate = interestRate;
    }

    @Override
    public String getDetails() {
       return "Saving = " + accountNo + ", Balance=" + (int)balance + ", Interest=" + (int)interestRate + "%";
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNo, double balance, double overdraftLimit) {
       super(accountNo, balance);
       this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getDetails() {
       return "Current = " + accountNo + ", Balance=" + (int)balance + ", Overdraft=" + (int)overdraftLimit;
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
       SavingAccount saving = new SavingAccount(101, 5000, 5);
       CurrentAccount current = new CurrentAccount(102, 10000, 2000);

       System.out.println(saving.getDetails());
       System.out.println(current.getDetails());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac BankAccountTypes.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java BankAccountTypes
Saving = 101, Balance=5000, Interest=5%
Current = 102, Balance=10000, Overdraft=2000
*/