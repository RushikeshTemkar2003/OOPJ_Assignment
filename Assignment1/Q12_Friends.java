/*  
12. Oldest and Youngest Among Three Friends  
Scenario: You and two friends want to know who is oldest and youngest.  
Take ages as input and print the oldest and youngest.  

Input:  
Enter age of Friend 1: 22  
Enter age of Friend 2: 25  
Enter age of Friend 3: 20  

Output:  
Oldest: Friend 2  
Youngest: Friend 3  
*/

import java.util.Scanner;

class Q12_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Friend 1: ");
        int age1 = sc.nextInt();
        System.out.print("Enter age of Friend 2: ");
        int age2 = sc.nextInt();
        System.out.print("Enter age of Friend 3: ");
        int age3 = sc.nextInt();

        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));

        if (oldest == age1) System.out.println("Oldest: Friend 1");
        else if (oldest == age2) System.out.println("Oldest: Friend 2");
        else System.out.println("Oldest: Friend 3");

        if (youngest == age1) System.out.println("Youngest: Friend 1");
        else if (youngest == age2) System.out.println("Youngest: Friend 2");
        else System.out.println("Youngest: Friend 3");
    }
}
 /*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q12_Friends.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q12_Friends
Enter age of Friend 1: 12
Enter age of Friend 2: 21
Enter age of Friend 3: 23
Oldest: Friend 3
Youngest: Friend 1
*/