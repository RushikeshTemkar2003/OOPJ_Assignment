/*
45. Sort Three Numbers in Ascending Order 
Scenario: Take three numbers and print them in ascending order. 

Input: 
Enter numbers: 45, 12, 78 

Output: 
Ascending order: 12, 45, 78 
*/

import java.util.Scanner;

class Q45_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int temp;
        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }

        System.out.println("Ascending order: " + a + ", " + b + ", " + c);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q45_Sort.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q45_Sort
Enter first number: 23
Enter second number: 45
Enter third number: 42
Ascending order: 23, 42, 45

*/