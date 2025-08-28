/*  
21. Day of the Week (Ternary)  
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.  

Input:  
Enter day number: 3  

Output:  
Day is Wednesday  
*/

import java.util.Scanner;

class Q21_WeekT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        String result = (day == 1) ? "Day is Monday" :
                        (day == 2) ? "Day is Tuesday" :
                        (day == 3) ? "Day is Wednesday" :
                        (day == 4) ? "Day is Thursday" :
                        (day == 5) ? "Day is Friday" :
                        (day == 6) ? "Day is Saturday" :
                        (day == 7) ? "Day is Sunday" : "Invalid day number.";

        System.out.println(result);
    }
}
/*C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q21_WeekT.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q21_WeekT
Enter day number (1-7): 4
Day is Thursday
*/