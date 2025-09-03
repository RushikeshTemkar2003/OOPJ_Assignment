/*
Problem 10: Student Marks Checker 
Scenario: 
Create a Student class with rollNo, name, and marks. 
● Use a parameterized constructor to initialize all fields. 
● Create a getter and setter for marks. 
● In main, create one student, update marks using setter, and print student details.
*/
class Student {
    private int rollNo;
    private String name;
    private int marks;
	
    Student(int rollNo, String name, int marks) {
      this.rollNo = rollNo;
      this.name = name;
      this.marks = marks;
    }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Problem10 {
    public static void main(String[] args) {
      Student s1 = new Student(1, "Rohan", 50);
      s1.setMarks(75);  // updating marks
      s1.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem10.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem10
Roll No: 1, Name: Rohan, Marks: 75
*/