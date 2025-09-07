/*
20. College Staff Hierarchy
Scenario: A college has employees who can be Teaching or Non-Teaching. Teaching staff can be
Professors or Lecturers.
Problem Statement:
Create classes:
● Employee → name, salary, displaySalary()
● TeachingStaff → subject, overrides displaySalary()
● Professor → specialization, overrides displaySalary()
● Lecturer → department, overrides displaySalary()
*/
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
    }

    public void displaySalary() {
       System.out.println(name + " = Salary=" + (int)salary);
    }
}

class TeachingStaff extends Employee {
    protected String subject;

    public TeachingStaff(String name, double salary, String subject) {
      super(name, salary);
      this.subject = subject;
    }

    @Override
    public void displaySalary() {
       System.out.print(name + " = Subject=" + subject + ", Salary=" + (int)salary);
    }
}

class Professor extends TeachingStaff {
    private String specialization;

    public Professor(String name, double salary, String subject, String specialization) {
      super(name, salary, subject);
      this.specialization = specialization;
    }

    @Override
    public void displaySalary() {
      System.out.println(name + " = Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + (int)salary);
    }
}

class Lecturer extends TeachingStaff {
    private String department;

    public Lecturer(String name, double salary, String subject, String department) {
      super(name, salary, subject);
      this.department = department;
    }

    @Override
    public void displaySalary() {
      System.out.println(name + " = Subject=" + subject + ", Department=" + department + ", Salary=" + (int)salary);
    }
}

public class CollegeStaffHierarchy {
    public static void main(String[] args) {
      Professor prof = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
      Lecturer lect = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");

      prof.displaySalary();
      lect.displaySalary();
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac CollegeStaffHierarchy.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java CollegeStaffHierarchy
Dr. Sharma = Subject=Math, Specialization=Algebra, Salary=80000
Ms. Mehta = Subject=Physics, Department=Science, Salary=50000
*/
