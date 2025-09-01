/*
Problem 16: Employee Net Salary 
Scenario: 
Extend previous problem. Add method calculateNetSalary(): 
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary 
● Print net salary for 2 employees 
*/
class Employee {
    int id;
    String name;
    double basicSalary;
    static int counter = 1001;

    Employee(String name, double basicSalary) {
      this.id = counter++;
      this.name = name;
      this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
       double hra = 0.10 * basicSalary;
       double da = 0.05 * basicSalary;
       double pf = 0.02 * basicSalary;
       return basicSalary + hra + da - pf;
    }

    void display() {
      System.out.println("ID: " + id + ", Name: " + name +
              ", Basic Salary: " + basicSalary +
              ", Net Salary: " + calculateNetSalary());
    }
}

public class Problem16 {
    public static void main(String[] args) {
      Employee e1 = new Employee("Ravi", 30000);
      Employee e2 = new Employee("Sneha", 40000);
	  e1.display();
      e2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem16.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem16
ID: 1001, Name: Ravi, Basic Salary: 30000.0, Net Salary: 33900.0
ID: 1002, Name: Sneha, Basic Salary: 40000.0, Net Salary: 45200.0
*/