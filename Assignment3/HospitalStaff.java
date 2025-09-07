/*
21. Hospital Staff
Scenario: Hospital has Staff members. Both Doctors and Nurses are Staff.
Problem Statement:
● Staff → name, staffId, displayDetails()
● Doctor → specialization, displayDetails() override
● Nurse → shift, displayDetails() override
*/
class Staff {
    protected String name;
    protected int staffId;

    public Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    public void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId);
    }
}

class Doctor extends Staff {
    private String specialization;

    public Doctor(String name, int staffId, String specialization) {
       super(name, staffId);
       this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
      System.out.println(name + " = Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

class Nurse extends Staff {
    private String shift;

    public Nurse(String name, int staffId, String shift) {
      super(name, staffId);
      this.shift = shift;
    }

    @Override
    public void displayDetails() {
       System.out.println(name + " = Staff ID=" + staffId + ", Shift=" + shift);
    }
}

public class HospitalStaff {
    public static void main(String[] args) {
      Doctor doctor = new Doctor("Dr. Reddy", 101, "Cardiology");
      Nurse nurse = new Nurse("Nisha", 102, "Night");

      doctor.displayDetails();
      nurse.displayDetails();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac HospitalStaff.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java HospitalStaff
Dr. Reddy = Staff ID=101, Specialization=Cardiology
Nisha = Staff ID=102, Shift=Night
*/