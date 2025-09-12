/*
Problem 22: Student Object Cleanup
Scenario: A student management system creates student objects during registration. When these objects
are no longer needed, the system should clean up resources before garbage collection.
Task: Override finalize method to demonstrate cleanup during garbage collection.
Sample Input:
Student Name: Amit
Expected Output:
Student object for Amit is being garbage collected.
*/
public class Student1 {

  String name;

  public Student1(String name){
    this.name = name;
  }

  public void cleanUp() {
    System.out.println("Student object for " + name + " is being garbage collected.");
  }

  public static void main(String[] args) {

    Student1 s = new Student1("Amit");
    s.cleanUp();

    s = null;
    System.gc();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac Student1.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java Student1
Student object for Amit is being garbage collected.
*/
