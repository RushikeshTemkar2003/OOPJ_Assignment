/*
30. Menu-Based Simple Arithmetic Operations 
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction, 
Multiplication, Division) and prints result.  

Input: 
Select operation (1-Addition, 2-Subtraction): 1 
Enter first number: 20 
Enter second number: 30 

Output: 
Result: 50 
*/

import java.util.Scanner;

class Q30_MenuBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Select operation (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + (a + b)); break;
            case 2: System.out.println("Result: " + (a - b)); break;
            case 3: System.out.println("Result: " + (a * b)); break;
            case 4: 
                if (b != 0) System.out.println("Result: " + (a / b)); 
                else System.out.println("Cannot divide by zero"); 
                break;
            default: System.out.println("Invalid choice");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q30_MenuBased.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q30_MenuBased
Select operation (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): 1
Enter first number: 12
Enter second number: 21
Result: 33
*/