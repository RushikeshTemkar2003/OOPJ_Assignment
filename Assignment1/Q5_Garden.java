/*
5. Square or Rectangle Garden 
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a 
square garden or rectangular. 
Input: 
Enter length: 12 
Enter breadth: 12 
Output: 
Square garden
*/
import java.util.Scanner;

class Q5_Garden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("Square garden");
        } else {
            System.out.println("Rectangular garden");
        }
    }
}

/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q5_Garden.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q5_Garden
Enter length: 12
Enter breadth: 12
Square garden

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q5_Garden
Enter length: 24
Enter breadth: 9
Rectangular garden
*/