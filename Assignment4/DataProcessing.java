/*
Problem 21: Data Processing Cleanup
Scenario: A data processing system handles user form submissions and must always close database
connections and clean up resources, whether the processing succeeds or fails.
Task: Use finally block to ensure proper resource cleanup.
*/
public class DataProcessing {

  public static void main(String[] args) {

    try {
      System.out.println("Processing user form...");
      throw new Exception("Invalid input");

    } catch(Exception e){
      System.out.println("Exception occurred: " + e.getMessage());
    }
    finally {
      System.out.println("Data processing completed");
    }

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac  DataProcessing.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java  DataProcessing
Processing user form...
Exception occurred: Invalid input
Data processing completed

*/
