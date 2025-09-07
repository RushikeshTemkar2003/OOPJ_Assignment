/*14. Employee Bonus Calculation
Scenario: A company has different types of employees with specific bonus calculation rules.
Problem Statement:
Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager →
bonus=20% of salary, Subclass Developer → bonus=10% of salary.
Classes/Fields:
● Employee → name, salary, calculateBonus() (abstract)
● Manager → bonus=20% of salary
● Developer → bonus=10% of salary
*/
abstract class Employee {
   protected String name;
   protected double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
    }

    public abstract double calculateBonus();
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return 0.20 * salary;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return 0.10 * salary;
    }
}

public class EmployeeBonusCalculation {
    public static void main(String[] args) {
     Manager manager = new Manager("Anita", 50000);
     Developer developer = new Developer("Rohit", 40000);

     System.out.println(manager.name + " Bonus = " + (int)manager.calculateBonus());
     System.out.println(developer.name + " Bonus = " + (int)developer.calculateBonus());
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac EmployeeBonusCalculation.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java EmployeeBonusCalculation
Anita Bonus = 10000
Rohit Bonus = 4000
*/