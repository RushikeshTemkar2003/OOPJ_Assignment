/*
Problem 12: Remove Extra Text
Scenario: An automated message system sometimes adds extra text that needs to be removed before
sending messages to students.
Task: Use StringBuilder to clean up message content.
*/
public class MessageCleanup {

  public static void main(String[] args) {

    String original = "Please read - Do not disturb";
    String toDelete = "- Do not disturb";

    StringBuilder message = new StringBuilder(original);

    int start = message.indexOf(toDelete);

    if(start != -1) {
      message.delete(start, start + toDelete.length());
    }

    System.out.println(message.toString().trim());

  }

}

/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac MessageCleanup.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java MessageCleanup
Please read
*/