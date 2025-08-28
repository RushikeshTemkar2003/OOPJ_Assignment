/*
48. Grade with Plus/Minus 
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−). 

Input: 
Enter marks: 78 

Output: 
Grade: A− 
*/

import java.util.Scanner;

class Q48_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade;

        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "A−";
        else if (marks >= 60) grade = "B";
        else if (marks >= 50) grade = "C";
        else if (marks >= 35) grade = "D";
        else grade = "F";

        System.out.println("Grade: " + grade);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q48_Grade.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q48_Grade
Enter marks: 45
Grade: D
*/