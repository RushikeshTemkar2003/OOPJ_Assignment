/*
4. Even or Odd Locker Number 
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is 
even or odd. 
Input: 
Enter locker number: 17 
Output: 
Odd locker number 
*/
import java.util.Scanner;

class Q4_Locker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter locker number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even locker number");
        } else {
            System.out.println("Odd locker number");
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q4_Locker.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q4_Locker
Enter locker number: 26
Even locker number
*/