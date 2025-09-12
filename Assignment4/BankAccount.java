/*
Problem 20: Bank Account Security
Scenario: A banking system needs to ensure that once a bank account ID is assigned, it cannot be
changed for security and audit purposes.
Task: Demonstrate the use of final variables in a banking context.
*/
public class BankAccount {

  final int accountId;

  public BankAccount(int id) {
    accountId = id;
  }

  public void displayAccountId() {
    System.out.println("Account ID = " + accountId + " (cannot be changed)");
  }

  public static void main(String[] args) {

    BankAccount account = new BankAccount(101);
    account.displayAccountId();

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac BankAccount.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java BankAccount
Account ID = 101 (cannot be changed)
*/