/*
Problem 19: Message Update System
Scenario: A communication system needs to update message status from "Old Notice" to "Updated
Notice" when information is refreshed.
Task: Use StringBuffer to update message status
*/
public class MessageUpdate {

  public static void main(String[] args) {

    String originalText = "Old Notice";
    String toFind = "Old";
    String replacement = "Updated";

    StringBuffer message = new StringBuffer(originalText);

    int index = message.indexOf(toFind);

    if(index != -1) {
      message.replace(index, index + toFind.length(), replacement);
    }

    System.out.println(message.toString());

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac MessageUpdate.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java MessageUpdate
Updated Notice
*/
