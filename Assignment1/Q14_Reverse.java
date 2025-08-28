/*  
14. Reverse a 4-Digit Number  
Scenario: Take a 4-digit number and print its reverse.  

Input:  
Enter 4-digit number: 1234  

Output:  
Reversed number: 4321  
*/

import java.util.Scanner;

class Q14_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q14_Reverse.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q14_Reverse
Enter 4-digit number: 2468
Reversed number: 8642
*/