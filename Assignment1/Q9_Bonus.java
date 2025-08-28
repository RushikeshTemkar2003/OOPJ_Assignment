/*  
9. Employee Bonus Eligibility  
Scenario: A company gives a 5% bonus to employees with more than 5 years of service.  
Take salary and years of service as input and print bonus amount.  

Input:  
Enter salary: 50000  
Enter years of service: 6  

Output:  
Bonus amount: 2500  
*/

import java.util.Scanner;

class Q9_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q9_Bonus.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q9_Bonus
Enter salary: 1200
Enter years of service: 10
Bonus amount: 60.0
*/