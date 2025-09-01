/*
Problem 8: Bank Account Initialization 
Scenario: 
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account 
has account holder name, balance, and interest rate. Students should practice static blocks for 
initialization and setters/getters to modify and access account details. 
Tasks: 
1. Create a BankAccount class. 
2. Use a static block to initialize interest rate to 4%. 
3. Create instance variables: name (String) and balance (double). 
4. Create setters and getters for name and balance. 
5. Print account details including interest rate. 
*/
class BankAccount {
    String name;
    double balance;
    static double interestRate;

    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }
	
    public void setName(String name) { this.name = name; }
    public void setBalance(double balance) { this.balance = balance; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    void display() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}

public class Problem8 {
    public static void main(String[] args) {
      BankAccount a1 = new BankAccount();
      a1.setName("Rohit");
      a1.setBalance(5000);

      BankAccount a2 = new BankAccount();
      a2.setName("Priya");
      a2.setBalance(15000);

      a1.display();
      a2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem8.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem8
Bank Interest Rate Initialized: 4.0%
Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/