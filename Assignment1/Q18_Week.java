/*  
18. Day of the Week  
Scenario: Take day number (1–7) and print the day name.  

Input:  
Enter day number: 4  

Output:  
Day is Thursday  
*/

import java.util.Scanner;

class Q18_Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        if (day == 1) System.out.println("Day is Monday");
        else if (day == 2) System.out.println("Day is Tuesday");
        else if (day == 3) System.out.println("Day is Wednesday");
        else if (day == 4) System.out.println("Day is Thursday");
        else if (day == 5) System.out.println("Day is Friday");
        else if (day == 6) System.out.println("Day is Saturday");
        else if (day == 7) System.out.println("Day is Sunday");
        else System.out.println("Invalid day number.");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q18_Week.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q18_Week
Enter day number (1-7): 5
Day is Friday
*/