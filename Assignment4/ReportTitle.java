/*
Problem 14: Report Title
Scenario: A report generation system needs to modify document titles by adding department names and
updating formatting.
Task: Use StringBuilder method chaining to efficiently modify report titles.
*/
public class ReportTitle {

  public static void main(String[] args) {
    
    String originalTitle = "Annual Report";
    String department = "CDAC";

    StringBuilder title = new StringBuilder(originalTitle);
    title.insert(6, department + " ");

    System.out.println(title.toString());

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac ReportTitle.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java ReportTitle
AnnualCDAC  Report

*/
