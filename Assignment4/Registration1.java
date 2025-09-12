/*
Problem 6: Age Restriction
Scenario: A professional workshop registration system only allows participants who are 18 years or
older. The system needs a custom exception for age validation.
Task: Create a custom exception class and use it to validate user age during registration
*/

class AgeNotValidException extends Exception {
 public AgeNotValidException(String msg) {
  super(msg);
 }
}

public class Registration1 {

 public static void main(String[] args) {

  int age = 16;

  try {
   if(age < 18){
    throw new AgeNotValidException("Age must be >= 18");
   } else {
    System.out.println("Registration Successful");
   }

  } catch(AgeNotValidException e){
   System.out.println("AgeNotValidException: " + e.getMessage());
  }

 }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac Registration1.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java Registration1
AgeNotValidException: Age must be >= 18
*/