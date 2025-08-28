/*
39. Bonus Eligibility (Ternary) 
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print 
bonus eligibility using ternary.  

Input: 
Enter salary: 50000 
Enter years of service: 6 

Output: 
Bonus: 2500 
*/

import java.util.Scanner;

class Q39_BonusT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = (years > 5) ? (salary * 0.05) : 0;
        System.out.println("Bonus: " + bonus);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q39_BonusT.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q39_BonusT
Enter salary: 2400
Enter years of service: 5
Bonus: 0.0
*/