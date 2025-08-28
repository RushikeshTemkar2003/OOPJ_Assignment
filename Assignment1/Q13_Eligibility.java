/*  
13. Exam Eligibility with Medical Cause  
Scenario: A student’s attendance is low but may have medical cause.  
Take classes held, attended, and medical cause (Y/N) as input and decide if the student can sit in exam.  

Input:  
Classes held: 100  
Classes attended: 60  
Medical cause (Y/N): Y  

Output:  
Student is allowed to sit for the exam.  
*/

import java.util.Scanner;

class Q13_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total classes held: ");
        int totalClasses = sc.nextInt();
        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();
        System.out.print("Medical cause (Y/N): ");
        char medical = sc.next().charAt(0);

        double percentage = (attended * 100.0) / totalClasses;

        if (percentage >= 75 || medical == 'Y' || medical == 'y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q13_Eligibility.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q13_Eligibility
Enter total classes held: 25
Enter classes attended: 23
Medical cause (Y/N): Y
Student is allowed to sit for the exam.
*/