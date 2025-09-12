/*
Problem 24: Salary Calculation
Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs
primitive int values for mathematical calculations.
Task: Demonstrate unboxing by extracting primitive values from wrapper objects.
*/
public class SalaryCalculation {

  public static void main(String[] args) {

    Integer ageObject = 25;
    int age = ageObject;

    System.out.println("int value: " + age);

  }

}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac SalaryCalculation.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java SalaryCalculation
int value: 25

*/