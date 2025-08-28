/*
1. Greatest of Two Test Scores 
Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print 
which test the friend scored higher in. 
Input: 
Enter score for Test 1: 78 
Enter score for Test 2: 85 
Output: 
Test 2 has higher score. 
*/

import java.util.Scanner;

public class Q1_Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter score for Test 1: ");
        int test1 = sc.nextInt();

        System.out.print("Enter score for Test 2: ");
        int test2 = sc.nextInt();
		
        if (test1 > test2) {
            System.out.println("Test 1 has higher score.");
        } else if (test2 > test1) {
            System.out.println("Test 2 has higher score.");
        } else {
            System.out.println("Both tests have equal scores.");
        }
    }
}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q1_Greatest.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q1_Greatest
Enter score for Test 1: 12
Enter score for Test 2: 21
Test 2 has higher score.
*/