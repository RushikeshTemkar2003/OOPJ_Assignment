/*
31. Greatest of Two Numbers (Ternary) 
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest using a ternary operator.  

Input: 
Enter first number: 45 
Enter second number: 30 

Output: 
Greatest number: 45 
*/

import java.util.Scanner;

class Q31_Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int greatest = (a > b) ? a : b;
        System.out.println("Greatest number: " + greatest);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q31_Greatest.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q31_Greatest
Enter first number: 21
Enter second number: 234
Greatest number: 234
*/