/*
35. Pass/Fail Check (Ternary) 
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).  

Input: 
Enter marks: 28 

Output: 
Fail 
*/

import java.util.Scanner;

class Q35_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 35) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q35_Result.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q35_Result
Enter marks: 26
Fail
*/