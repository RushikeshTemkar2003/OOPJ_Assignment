/*
28. Traffic Signal Instruction 
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.  

Input: 
Enter traffic light color: Green 

Output: 
Go 
*/

import java.util.Scanner;

class Q28_Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color: ");
        String color = sc.next().toLowerCase();

        switch (color) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Wait"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color");
        }
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q28_Traffic.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q28_Traffic
Enter traffic light color: Red
Stop
*/