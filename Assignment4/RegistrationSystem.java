/*Problem 3: Age Input 
Scenario: A registration form for an online course asks for the user's age. Sometimes users accidentally 
enter text instead of numbers, causing the system to crash. 
 
Task: Create a registration system that safely converts age input from string to integer. 
 
Sample Input: 
eighteen 
*/ 
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
      System.out.print("Enter your age: ");
      String input = sc.nextLine();  
      try {
         int age = Integer.parseInt(input);  // Attempt to convert to integer
         System.out.println("Age entered: " + age);
      } catch (NumberFormatException e) {
         System.out.println("Invalid number format");
      }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac RegistrationSystem.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java RegistrationSystem
Enter your age: 18
Age entered: 18

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java RegistrationSystem
Enter your age: Eighteen
Invalid number format
*/