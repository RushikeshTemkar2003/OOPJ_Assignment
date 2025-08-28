/*
29. Day Type Selection 
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.  

Input: 
Enter day type (1–Workday, 2–Weekend): 2 

Output: 
It’s weekend. No work today. 
*/

import java.util.Scanner;

class Q29_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day type (1-Workday, 2-Weekend): ");
        int type = sc.nextInt();

        if (type == 1)
            System.out.println("It’s workday. Time to work.");
        else if (type == 2)
            System.out.println("It’s weekend. No work today.");
        else
            System.out.println("Invalid choice.");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q29_Day.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q29_Day
Enter day type (1-Workday, 2-Weekend): 1
It?s workday. Time to work.
*/