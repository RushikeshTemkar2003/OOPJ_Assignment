/*
16. Employee Salary Display
Scenario: Company wants to display employee salary with different bonus calculations based on
employee type.
Problem Statement:
Create class Employee with method displaySalary(). Subclass Manager and Developer override
displaySalary() to include bonus.
Classes/Fields:
● Employee → name, salary, displaySalary() prints salary
● Manager → overrides displaySalary() → adds 20% bonus
● Developer → overrides displaySalary() → adds 10% bonus
*/
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
    }

    public void displaySalary() {
      System.out.println(name + " Total Salary = " + (int)salary);
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
       super(name, salary);
    }

    @Override
    public void displaySalary() {
       double total = salary + (0.20 * salary);
       System.out.println(name + " Total Salary = " + (int)total);
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
       super(name, salary);
    }

    @Override
    public void displaySalary() {
       double total = salary + (0.10 * salary);
       System.out.println(name + " Total Salary = " + (int)total);
    }
}

public class EmployeeSalaryDisplay {
    public static void main(String[] args) {
      Manager manager = new Manager("Anita", 50000);
      Developer developer = new Developer("Rohit", 40000);

      manager.displaySalary();
      developer.displaySalary();
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac EmployeeSalaryDisplay.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java EmployeeSalaryDisplay
Anita Total Salary = 60000
Rohit Total Salary = 44000
*/
