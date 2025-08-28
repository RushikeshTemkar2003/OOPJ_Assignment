/*
43. Sum of Digits of a Number 
Scenario: Take a number as input and print the sum of its digits. 

Input: 
Enter number: 482 

Output: 
Sum of digits: 14 
*/

import java.util.Scanner;

class Q43_SumofT/ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q43_SumofT.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q43_SumofT
Enter number: 23
Sum of digits: 5
*/