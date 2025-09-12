/*
Problem 2: Exam Scores 
Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might 
accidentally try to access the score of a student number that doesn't exist in the class roster. 
 
Task: Create a program that stores exam scores in an array and safely accesses student scores by index. 
*/
public class Teacher{
	public static void main(String args[]){
		int [] arr={12,14,16,18,19};
		try{
			arr[7]=100;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index Accessed");
		}
	}
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac Teacher.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java Teacher
Invalid Index Accessed
*/ 