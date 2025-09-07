/*
23. School Members
Scenario: School has members: Teachers, Students, and Staff. All share common info.
Problem Statement:
● Member → name, id, displayInfo()
● Teacher → subject, overrides displayInfo()
● Student → grade, overrides displayInfo()
● Staff → department, overrides displayInfo()
*/
class Member {
    protected String name;
    protected int id;

    public Member(String name, int id) {
      this.name = name;
      this.id = id;
    }

    public void displayInfo() {
      System.out.println(name + " → ID=" + id);
    }
}

class Teacher extends Member {
    private String subject;

    public Teacher(String name, int id, String subject) {
      super(name, id);
      this.subject = subject;
    }

    @Override
    public void displayInfo() {
      System.out.println(name + " = ID=" + id + ", Subject=" + subject);
    }
}

class Student extends Member {
    private int grade;

    public Student(String name, int id, int grade) {
      super(name, id);
      this.grade = grade;
    }

    @Override
    public void displayInfo() {
      System.out.println(name + " = ID=" + id + ", Grade=" + grade);
    }
}

class Staff extends Member {
    private String department;

    public Staff(String name, int id, String department) {
      super(name, id);
      this.department = department;
    }

    @Override
    public void displayInfo() {
      System.out.println(name + " = ID=" + id + ", Department=" + department);
    }
}

public class SchoolMembers {
    public static void main(String[] args) {
      Teacher teacher = new Teacher("Mr. Kumar", 101, "English");
      Student student = new Student("Riya", 201, 10);
      Staff staff = new Staff("Mr. Das", 301, "Maintenance");

      teacher.displayInfo();
      student.displayInfo();
      staff.displayInfo();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac SchoolMembers.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java SchoolMembers
Mr. Kumar = ID=101, Subject=English
Riya = ID=201, Grade=10
Mr. Das = ID=301, Department=Maintenance
*/