/*
36. Smallest of Three Numbers (Nested Ternary) 
Scenario: Take three numbers as input and print the smallest using nested ternary operator.  

Input: 
Enter numbers: 12, 8, 19 

Output: 
Smallest number: 8 
*/

import java.util.Scanner;

class Q36_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Smallest number: " + smallest);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q36_Smallest.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q36_Smallest
Enter first number: 24
Enter second number: 43
Enter third number: 12
Smallest number: 12
*/