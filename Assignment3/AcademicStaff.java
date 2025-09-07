/*
10. Academic Staff
Scenario: University has teaching and non-teaching staff.
Problem Statement:
Superclass Staff with name, salary. Subclass TeachingStaff adds subject, Subclass NonTeachingStaff
adds department. Display staff info.
Classes/Fields:
● Staff → name, salary
● TeachingStaff → subject
● NonTeachingStaff → department
*/
class Staff {
    protected String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return name + ", " + salary;
    }
}

class TeachingStaff extends Staff {
    private String subject;

    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    public String getDetails() {
        return name + " = " + subject + ", " + (int)salary;
    }
}

class NonTeachingStaff extends Staff {
    private String department;

    public NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return name + " = " + department + ", " + (int)salary;
    }
}

public class AcademicStaff {
    public static void main(String[] args) {
        TeachingStaff tStaff = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff ntStaff = new NonTeachingStaff("Ramesh", 40000, "Admin");

        System.out.println(tStaff.getDetails());
        System.out.println(ntStaff.getDetails());
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac AcademicStaff.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java AcademicStaff
Anita = Math, 50000
Ramesh = Admin, 40000
*/