/*  
16. Vowel or Consonant Checker  
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid input.  

Input:  
Enter a character: e  

Output:  
Vowel  
*/

import java.util.Scanner;

class Q16_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Error: Invalid input.");
        } else {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q16_Checker.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q16_Checker
Enter a character: A
Vowel

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q16_Checker
Enter a character: B
Consonant
*/