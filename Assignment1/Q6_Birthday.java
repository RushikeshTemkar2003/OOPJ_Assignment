/*
6. Leap Year Check for a Birthday 
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input 
and check if it’s a leap year. 
Input: 
Enter year: 2024 
Output: 
2024 is a leap year. 
*/
import java.util.Scanner;

class Q6_Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q6_Birthday.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q6_Birthday
Enter year: 2020
2020 is a leap year.

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q6_Birthday
Enter year: 2003
2003 is not a leap year.
*/