/*
47. Even/Odd Status of Two Numbers 
Scenario: Take two numbers and print if both are even, both odd, or mixed. 

Input: 
Enter first number: 12 
Enter second number: 17 

Output: 
Numbers are mixed (one even, one odd) 
*/

import java.util.Scanner;

class Q47_Eveodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0)
            System.out.println("Both numbers are even");
        else if (a % 2 != 0 && b % 2 != 0)
            System.out.println("Both numbers are odd");
        else
            System.out.println("Numbers are mixed (one even, one odd)");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q47_Eveodd.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q47_Eveodd
Enter first number: 23
Enter second number: 32
Numbers are mixed (one even, one odd)
*/