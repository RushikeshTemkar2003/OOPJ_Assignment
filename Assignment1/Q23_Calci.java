/*  
23. Basic Calculator Using Switch-Case  
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result.  

Input:  
Enter first number: 15  
Enter second number: 3  
Enter operator: /  

Output:  
Result: 5  
*/

import java.util.Scanner;

class Q23_Calci {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number: ");
	double num1 = sc.nextDouble();
	System.out.print("Enter second number: ");
	double num2 = sc.nextDouble();
	System.out.print("Enter operator (+, -, *, /): ");
	char op = sc.next().charAt(0);

	switch (op) {
		case '+':
			System.out.println("Result: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Result: " + (num1 - num2));
			break;
		case '*':
			System.out.println("Result: " + (num1 * num2));
			break;
		case '/':
			if (num2 != 0)
				System.out.println("Result: " + (num1 / num2));
			else
				System.out.println("Error: Division by zero.");
			break;
		default:
			System.out.println("Invalid operator.");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q23_Calci.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q23_Calci
Enter first number: 12
Enter second number: 23
Enter operator (+, -, *, /): +
Result: 35.0
*/