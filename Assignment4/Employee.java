/*
Problem 1: Salary Split 
Scenario: You are developing a payroll system for a company. The HR department wants to distribute a 
bonus equally among employees in a department. However, sometimes a department might have zero 
employees due to restructuring. 
 
Task: Create a method that divid
*/
public class Employee {
   private int bonus;
   private int employeeNumber;

   public Employee(int bonus, int employeeNumber) {
      this.bonus = bonus;
      this.employeeNumber = employeeNumber;
  }

  public void checkDivision() {
      try {
        if (bonus % employeeNumber == 0) {
        System.out.println("Bonus is divisible by employee number.");
       } else {
        System.out.println("Bonus is NOT divisible by employee number.");
       }
    } catch (ArithmeticException e) {
		System.out.println(bonus);
		System.out.println(employeeNumber);
        System.out.println("Error: Division by zero not allowed");
      }
  }

  public static void main(String[] args) {
      Employee e = new Employee(10000, 0);  // employeeNumber is 0, will trigger catch block
      e.checkDivision();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac Employee.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java Employee
10000
0
Error: Division by zero not allowed
*/