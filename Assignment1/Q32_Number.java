/*
32. Positive, Negative, or Zero (Ternary) 
Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator.  

Input: 
Enter a number: -12 

Output: 
Number is Negative 
*/

import java.util.Scanner;

class Q32_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num > 0) ? "Number is Positive" :
                        (num < 0) ? "Number is Negative" :
                        "Number is Zero";
        System.out.println(result);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q32_Number.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q32_Number
Enter a number: 23
Number is Positive
*/