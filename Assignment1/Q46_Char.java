/*
46. Character Type Checker 
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character. 

Input: 
Enter character: % 

Output: 
Special Character 
*/

import java.util.Scanner;

class Q46_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch))
            System.out.println("Alphabet");
        else if (Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q46_Char.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q46_Char
Enter a character: A
Alphabet
*/