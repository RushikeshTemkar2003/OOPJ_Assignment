/*
Problem 11: Student Grade Calculator 
Scenario: 
Extend previous problem. Add method calculateGrade() which returns: 
● "A" if marks ≥ 80 
● "B" if marks ≥ 60 
● "C" if marks ≥ 40 
● "Fail" otherwise 
● Create 2 students, print marks and grades.
*/
class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
      this.rollNo = rollNo;
      this.name = name;
      this.marks = marks;
    }

    String calculateGrade() {
      if (marks >= 80) return "A";
      else if (marks >= 60) return "B";
      else if (marks >= 40) return "C";
      else return "Fail";
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

public class Problem11 {
    public static void main(String[] args) {
      Student s1 = new Student(1, "Rohan", 85);
      Student s2 = new Student(2, "Sneha", 45);

      s1.display();
      s2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem11.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem11
Roll No: 1, Name: Rohan, Marks: 85, Grade: A
Roll No: 2, Name: Sneha, Marks: 45, Grade: C
*/