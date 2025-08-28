/*  
10. Exam Attendance Eligibility  
Scenario: A student can sit in exams only if attendance >=75%.  
Take total classes held and attended as input, print allowance.  

Input:  
Enter total classes held: 100  
Enter classes attended: 78  

Output:  
Student is allowed to sit for the exam.  
*/

import java.util.Scanner;

class Q10_Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total classes held: ");
        int totalClasses = sc.nextInt();
        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / totalClasses;
        if (percentage >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q10_Attendance.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q10_Attendance
Enter total classes held: 25
Enter classes attended: 20
Student is allowed to sit for the exam.
*/