/*
Problem 10: Greeting Message
Scenario: A learning management system generates personalized greeting messages for students. The
system starts with a basic greeting and adds course-specific information.
Task: Use StringBuilder to create a personalized greeting message.
*/
public class GreetingMessage {

  public static void main(String[] args) {
    
    String initialText = "Hello";
    String textToInsert = "CDAC";
    int insertIndex = 5;
    String textToAppend = "Java Student";

    StringBuilder greeting = new StringBuilder(initialText);

    greeting.insert(insertIndex, " " + textToInsert + " ");

    greeting.append(" " + textToAppend);

    System.out.println(greeting.toString());

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac GreetingMessage.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java GreetingMessage
Hello CDAC  Java Student
*/
