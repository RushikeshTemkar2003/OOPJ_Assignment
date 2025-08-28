/*
33. Even or Odd (Ternary) 
Scenario: Take a number and check if it is even or odd using ternary operator.  

Input: 
Enter a number: 17 

Output: 
Number is Odd 
*/

import java.util.Scanner;

class Q33_EO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(result);
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q33_EO.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q33_EO
Enter a number: 23
Number is Odd
*/