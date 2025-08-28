/*
41. Check Armstrong Number (3-Digit) 
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits = number). 

Input: 
Enter number: 153 

Output: 
153 is an Armstrong number 
*/

import java.util.Scanner;

class Q41_Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3-digit number: ");
        int num = sc.nextInt();
        int original = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q41_Amstrong.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q41_Amstrong
Enter 3-digit number: 235
235 is not an Armstrong number
*/