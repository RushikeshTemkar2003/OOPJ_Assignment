/*
50. Divisibility by 2, 3, 5 with Custom Messages 
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each. 

Input: 
Enter number: 30 

Output: 
Divisible by 2 
Divisible by 3 
Divisible by 5 
*/

import java.util.Scanner;

class Q50_Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) System.out.println("Divisible by 2");
        if (num % 3 == 0) System.out.println("Divisible by 3");
        if (num % 5 == 0) System.out.println("Divisible by 5");

        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0)
            System.out.println("Not divisible by 2, 3, or 5");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q50_Divisibility.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q50_Divisibility
Enter number: 23
Not divisible by 2, 3, or 5
*/