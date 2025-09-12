/*
Problem 9: Marks Validation
Scenario: An online examination system needs to validate that marks entered by teachers are within valid
range (0-100). Negative marks should not be allowed.
Task: Create a marks validation method that throws an exception for invalid marks.
*/
class InvalidMarksException extends Exception {
  public InvalidMarksException(String msg) {
    super(msg);
  }
}

public class MarksValidation {

  public static void main(String[] args) {
    
    int marks = -5;

    try {
      validateMarks(marks);
      System.out.println("Marks are valid");
    } catch (InvalidMarksException e) {
      System.out.println("Invalid marks");
    }

  }

  static void validateMarks(int marks) throws InvalidMarksException {
    if (marks < 0 || marks > 100) {
      throw new InvalidMarksException("Marks should be between 0 and 100");
    }
  }

}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac MarksValidation.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java MarksValidation
Invalid marks
*/
