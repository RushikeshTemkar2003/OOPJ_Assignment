/*
Problem 26: Salary Storage
Scenario: A financial system needs to convert primitive double salary values to Double objects for
storage in collections and database operations.
Task: Use valueOf method to convert primitives to wrapper objects.
*/
public class SalaryStorage {

  public static void main(String[] args) {

    double salary = 45000.5;
    Double salaryObject = Double.valueOf(salary);

    System.out.println("Double object: " + salaryObject);

  }

}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac SalaryStorage.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java SalaryStorage
Double object: 45000.5
*/
