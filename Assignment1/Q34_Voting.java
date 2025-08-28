/*
34. Voting Eligibility (Ternary) 
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator.  

Input: 
Enter age: 20 

Output: 
Eligible to vote 
*/

import java.util.Scanner;

class Q34_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
        System.out.println(result);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q34_Voting.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q34_Voting
Enter age: 21
Eligible to vote
*/