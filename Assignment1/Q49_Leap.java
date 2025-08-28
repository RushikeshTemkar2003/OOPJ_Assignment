/*
49. Days in Month Considering Leap Year 
Scenario: Take a year and month number, print days in that month considering leap years. 

Input: 
Enter year: 2024 
Enter month number: 2 

Output: 
29 days 
*/

import java.util.Scanner;

class Q49_Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31; break;
            case 4: case 6: case 9: case 11:
                days = 30; break;
            case 2:
                days = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
                break;
            default:
                days = -1;
        }

        if (days == -1)
            System.out.println("Invalid month number");
        else
            System.out.println(days + " days");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q49_Leap.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q49_Leap
Enter year: 2020
Enter month number: 6
30 days
*/
