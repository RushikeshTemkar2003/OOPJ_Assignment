/*
Problem 15:  Employee Auto-ID Generator 
Scenario: 
Create Employee class with id, name, basicSalary. 
● Add static counter starting from 1001 for IDs. 
● Default constructor → name = "Unknown", salary = 20000 
● Parameterized constructor → accept name and salary 
● Getter for all variables 
● Create 2 employees and display their IDs, names, salary
*/
class Employee {
    int id;
    String name;
    double basicSalary;
    static int counter = 1001;

    Employee() {
      this.id = counter++;
      this.name = "Unknown";
      this.basicSalary = 20000;
    }

    Employee(String name, double basicSalary) {
      this.id = counter++;
      this.name = name;
      this.basicSalary = basicSalary;
    }

    int getId() { return id; }
    String getName() { return name; }
    double getBasicSalary() { return basicSalary; }

    void display() {
       System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + basicSalary);
    }
}

public class Problem15 {
    public static void main(String[] args) {
      Employee e1 = new Employee();
      Employee e2 = new Employee("Rohan", 30000);

      e1.display();
      e2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem15.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem15
ID: 1001, Name: Unknown, Salary: 20000.0
ID: 1002, Name: Rohan, Salary: 30000.0
*/