/*
24. Grade Using Switch (Ranges) 
Scenario: Take marks (0–100) and print grade using switch-case grouping: 
● 0–24 → F 
● 25–44 → E 
● 45–54 → D 
● 55–69 → C 
● 70–84 → B 
● 85–100 → A 

Input: 
Enter marks: 78 

Output: 
Grade: B 
*/

import java.util.Scanner;

class Q24_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade;

        switch (marks / 10) {
            case 0: case 1: case 2: 
                grade = "F"; break;
            case 3: case 4: 
                grade = "E"; break;
            case 5: 
                grade = "D"; break;
            case 6: 
                grade = "C"; break;
            case 7: case 8: 
                grade = (marks <= 84) ? "B" : "A"; break;
            case 9: case 10:
                grade = "A"; break;
            default: 
                grade = "Invalid";
        }
        System.out.println("Grade: " + grade);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q24_Grade.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q24_Grade
Enter marks: 60
Grade: C
*/