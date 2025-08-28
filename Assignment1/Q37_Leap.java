/*
37. Leap Year Check (Ternary) 
Scenario: Take a year as input and check if it is a leap year using ternary operator.  

Input: 
Enter year: 2024 

Output: 
Leap Year 
*/

import java.util.Scanner;

class Q37_Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "Leap Year" : "Not Leap Year";
        System.out.println(result);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q37_Leap.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q37_Leap
Enter year: 2020
Leap Year
*/