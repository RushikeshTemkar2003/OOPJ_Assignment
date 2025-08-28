/*
38. Vowel or Consonant (Ternary) 
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.  

Input: 
Enter character: i 

Output: 
Vowel 
*/

import java.util.Scanner;

class Q38_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        String result = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? "Vowel" : "Consonant";
        System.out.println(result);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q38_Alphabet.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q38_Alphabet
Enter a character: A
Vowel
*/