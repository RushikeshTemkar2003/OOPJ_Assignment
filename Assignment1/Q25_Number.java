/*
25. Message Based on Number (1–5) 
Scenario: Take a number (1–5) and print a message according to the case.  

Input: 
Enter a number: 3 

Output: 
You selected option 3. 
*/

import java.util.Scanner;

class Q25_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-5): ");
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println("You selected option 1."); break;
            case 2: System.out.println("You selected option 2."); break;
            case 3: System.out.println("You selected option 3."); break;
            case 4: System.out.println("You selected option 4."); break;
            case 5: System.out.println("You selected option 5."); break;
            default: System.out.println("Invalid option.");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q25_Number.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q25_Number
Enter a number (1-5): 4
You selected option 4.
*/