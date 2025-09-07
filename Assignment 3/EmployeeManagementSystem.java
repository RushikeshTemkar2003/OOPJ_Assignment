/*
29. Employee Management System
Scenario: Manage employee details, calculate salaries, and differentiate employee types.
Problem Statement:
● Abstract Class Employee → instance variables: name, id
○ Abstract method calculateSalary() → different calculation for each type
● Class PermanentEmployee extends Employee → include basicSalary and hra → implement
calculateSalary()
● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked →
implement calculateSalary()
● Interface BonusEligible → method calculateBonus() → applies only to permanent employees
● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible
*/

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
      this.name = name;
      this.id = id;
    }

    public abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {
    private double basicSalary;
    private double hra;

    public PermanentEmployee(String name, int id, double basicSalary, double hra) {
      super(name, id);
      this.basicSalary = basicSalary;
      this.hra = hra;
    }

    @Override
    public double calculateSalary() {
      return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
       return calculateSalary() * 0.10; // 10% bonus
    }
}

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
       super(name, id);
       this.hourlyRate = hourlyRate;
       this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
       return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem {
  public static void main(String[] args) {
   PermanentEmployee pe1 = new PermanentEmployee("Amit", 101, 50000, 5000);
   PermanentEmployee pe2 = new PermanentEmployee("Ravi", 102, 60000, 6000);

   ContractEmployee ce1 = new ContractEmployee("Neha", 201, 300, 100);
   ContractEmployee ce2 = new ContractEmployee("Karan", 202, 250, 120);

   Employee[] employees = {pe1, pe2, ce1, ce2};

  for (Employee e : employees) {
	  if (e instanceof BonusEligible) {
		 BonusEligible be = (BonusEligible) e;
		 System.out.println(e.name + " Salary = " + e.calculateSalary() + ", Bonus = " + be.calculateBonus());
	  } else {
		 System.out.println(e.name + " Salary = " + e.calculateSalary());
		}
	}
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac EmployeeManagementSystem.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java EmployeeManagementSystem
Amit Salary = 55000.0, Bonus = 5500.0
Ravi Salary = 66000.0, Bonus = 6600.0
Neha Salary = 30000.0
Karan Salary = 30000.0

*/