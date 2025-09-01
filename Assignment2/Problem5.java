/*
Problem 5: Student Marks Calculator 
Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in 
the class. 
Requirements: 
1. Create a class Student with instance variables: name (String), marks (int). 
2. Create static variable totalStudents to count total number of students. 
3. Constructor to initialize student details and increment totalStudents. 
4. Getter and Setter for marks. 
5. Method isPassed() returns true if marks >= 35, false otherwise. 
6. Static method showTotalStudents() prints total students. 
7. In main class, create 3 students, check if they passed, and show total students. 
*/
class Student {
    String name;
    int marks;
    static int totalStudents = 0;

    public Student(String name, int marks) {
      this.name = name;
      this.marks = marks;
      totalStudents++;
    }

    public boolean isPassed() {
       return marks >= 35;
    }

    public static void showTotalStudents() {
       System.out.println("Total students: " + totalStudents);
    }

    public String getName() {
        return name;
    }
}
public class Problem5 {
    public static void main(String[] args) {
      Student s1 = new Student("Rahul", 78);
      Student s2 = new Student("Pooja", 34);
      Student s3 = new Student("Amit", 65);

      System.out.println("Student " + s1.getName() + " Passed? " + s1.isPassed());
      System.out.println("Student " + s2.getName() + " Passed? " + s2.isPassed());
      System.out.println("Student " + s3.getName() + " Passed? " + s3.isPassed());
      Student.showTotalStudents();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem5.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem5
Student Rahul Passed? true
Student Pooja Passed? false
Student Amit Passed? true
Total students: 3
*/