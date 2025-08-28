/*
44. Reverse 4-Digit Number and Palindrome Check 
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome. 

Input: 
Enter 4-digit number: 1221 

Output: 
Reversed number: 1221 
Palindrome: Yes 
*/

import java.util.Scanner;

class Q44_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        int original = num, rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        System.out.println("Reversed number: " + rev);
        System.out.println("Palindrome: " + (rev == original ? "Yes" : "No"));
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q44_Reverse.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q44_Reverse
Enter 4-digit number: 2356
Reversed number: 6532
Palindrome: No
*/