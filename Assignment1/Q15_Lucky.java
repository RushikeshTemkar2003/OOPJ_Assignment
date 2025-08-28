/*  
15. Lucky Number Check  
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.  

Input:  
Enter 4-digit number: 3521  

Output:  
Not a lucky number  
*/

import java.util.Scanner;

class Q15_Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int A = num / 1000;
        int B = (num / 100) % 10;
        int C = (num / 10) % 10;
        int D = num % 10;

        if ((A + B) == (C + D)) {
            System.out.println("Lucky number");
        } else {
            System.out.println("Not a lucky number");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q15_Lucky.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q15_Lucky
Enter 4-digit number: 3790
Not a lucky number

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q15_Lucky
Enter 4-digit number: 3443
Lucky number
*/