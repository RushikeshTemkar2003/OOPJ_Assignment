/*
7. Employee Hierarchy
Scenario: A company has regular and contractual employees with different pay structures.
Problem Statement:
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%,
Subclass ContractEmployee adds allowance 5%. Display net salary.
Classes/Fields:
● Employee → name, basicSalary
● RegularEmployee → HRA 10%
● ContractEmployee → allowance 5%
*/
class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double getNetSalary() {
        return basicSalary;
    }
}

class RegularEmployee extends Employee {
    public RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getNetSalary() {
        double hra = 0.10 * basicSalary; 
        return basicSalary + hra;
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getNetSalary() {
        double allowance = 0.05 * basicSalary; 
        return basicSalary + allowance;
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        RegularEmployee regularEmp = new RegularEmployee("Rahul", 20000);
        ContractEmployee contractEmp = new ContractEmployee("Riya", 15000);

        System.out.println(regularEmp.name + " Net Salary = " + (int)regularEmp.getNetSalary());
        System.out.println(contractEmp.name + " Net Salary = " + (int)contractEmp.getNetSalary());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac EmployeeHierarchy.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java EmployeeHierarchy
Rahul Net Salary = 22000
Riya Net Salary = 15750
*/