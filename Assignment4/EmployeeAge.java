/*
Problem 23: Employee Age Management
Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int
values to Integer objects for database storage and collection operations.
Task: Demonstrate autoboxing by converting primitive int to Integer object.
*/
public class EmployeeAge {

  public static void main(String[] args) {

    int age = 30;
    Integer ageObject = age;

    System.out.println("Integer object: " + ageObject);

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac EmployeeAge.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java EmployeeAge
Integer object: 30
*/
