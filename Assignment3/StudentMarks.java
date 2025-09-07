/*
2. Student Marks
Scenario: A teacher wants to update student marks but must ensure marks are valid.
Problem Statement:
Create a class Student with private marks. Create getter and setter with validation (0–100).
Fields:
● private int marks
Methods:
● setMarks(int marks) → validate and set
● getMarks() → return marks
*/
class Student {
    private int marks;

    public void setMarks(int marks) {
      if (marks >= 0 && marks <= 100) {
           this.marks = marks;
      } else {
           System.out.println("Invalid marks! Must be between 0 and 100.");
       }
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
       Student s = new Student();
       s.setMarks(85);
       System.out.println("Marks = " + s.getMarks());

       s.setMarks(150);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac StudentMarks.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java StudentMarks
Marks = 85
Invalid marks! Must be between 0 and 100.
*/