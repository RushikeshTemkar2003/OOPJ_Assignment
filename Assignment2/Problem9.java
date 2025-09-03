/*
Problem 9: School Fee System 
Scenario: 
A school wants to initialize the tuition fee for all students once at program start. Each student has name 
and class. Use static blocks to set the fee and setters/getters to update/access student information. 
Tasks: 
1. Create a Student class. 
2. Use a static block to initialize tuitionFee to 30000. 
3. Create instance variables: name (String) and className (String). 
4. Create setters and getters for name and className. 
5. Print student details including tuition fee.  
*/
class Student {
    private String name;
    private String className;
    private static int tuitionFee;

    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    public void setName(String name) { this.name = name; }
    public void setClassName(String className) { this.className = className; }
    public String getName() { return name; }
    public String getClassName() { return className; }

    void display() {
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
}

public class Problem9 {
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.setName("Anjali");
      s1.setClassName("10th");

      Student s2 = new Student();
      s2.setName("Vikram");
      s2.setClassName("12th");

      s1.display();
      s2.display();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem9.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem9
School Tuition Fee Initialized: 30000
Name=Anjali, Class=10th, Tuition Fee=30000
Name=Vikram, Class=12th, Tuition Fee=30000
*/
