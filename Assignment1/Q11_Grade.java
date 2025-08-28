/*  
11. Grade Based on Percentage  
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:  
● 90+ → A+  
● 76–89 → A  
● 66–75 → B+  
● 51–65 → B  
● 36–50 → C  
● Below 35 → Fail  

Input:  
Enter percentage marks: 82  

Output:  
Grade: A  
*/

import java.util.Scanner;

class Q11_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage marks: ");
        int percentage = sc.nextInt();

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 76) {
            System.out.println("Grade: A");
        } else if (percentage >= 66) {
            System.out.println("Grade: B+");
        } else if (percentage >= 51) {
            System.out.println("Grade: B");
        } else if (percentage >= 36) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q11_Grade.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q11_Grade.java
Enter percentage marks: 20
Grade: Fail

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q11_Grade
Enter percentage marks: 80
Grade: A
*/