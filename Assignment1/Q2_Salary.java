/*
2. Highest Salary Among Three Offers 
Scenario: You have three job offers. Take the offered salaries as input and print which company is 
offering the highest salary. 
Input: 
Enter salary for Company 1: 45000 
Enter salary for Company 2: 52000 
Enter salary for Company 3: 50000 
Output: 
Company 2 offers the highest salary. 
*/

import java.util.Scanner;

public class Q2_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary for Company 1: ");
        int c1 = sc.nextInt();

        System.out.print("Enter salary for Company 2: ");
        int c2 = sc.nextInt();

        System.out.print("Enter salary for Company 3: ");
        int c3 = sc.nextInt();

        if (c1 > c2 && c1 > c3) {
            System.out.println("Company 1 offers the highest salary.");
        } else if (c2 > c1 && c2 > c3) {
            System.out.println("Company 2 offers the highest salary.");
        } else if (c3 > c1 && c3 > c2) {
            System.out.println("Company 3 offers the highest salary.");
        } else {
            System.out.println("Two or more companies offer the same highest salary.");
        }

    }
}

/*
C:\Users>cd "C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1"

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q2_Salary.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q2_Salary
Enter salary for Company 1: 1200
Enter salary for Company 2: 2300
Enter salary for Company 3: 2500
Company 3 offers the highest salary.
*/