/*
3. Employee Age Validation
Scenario: HR wants to ensure employees entered in the system are adults.
Problem Statement:
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18.
Fields:
● private int age
Methods:
● setAge(int age) → if age >=18, set; else show error
● getAge() → returns age
*/
class Employee {
    private int age;

    public void setAge(int age) {
       if (age >= 18) {
           this.age = age;
       } else {
           System.out.println("Invalid age");
       }
    }

    public int getAge() {
        return age;
    }
}

public class EmployeeAgeValidation {
    public static void main(String[] args) {
      Employee emp = new Employee();
      emp.setAge(17);
      System.out.println("Age = " + emp.getAge());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac EmployeeAgeValidation.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java EmployeeAgeValidation
Invalid age
Age = 0
*/