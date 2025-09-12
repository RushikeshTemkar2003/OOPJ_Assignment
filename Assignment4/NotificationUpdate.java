/*
Problem 11: Notification Update
Scenario: A university notification system needs to update announcements when exam schedules change.
The system should efficiently replace old information with new information.
Task: Use StringBuilder to update notification messages.
*/
public class NotificationUpdate {

  public static void main(String[] args) {
    
    String original = "Exam postponed";
    String toFind = "postponed";
    String replacement = "rescheduled";

    StringBuilder notification = new StringBuilder(original);
    int index = notification.indexOf(toFind);

    if(index != -1) {
      notification.replace(index, index + toFind.length(), replacement);
    }

    System.out.println(notification.toString());

  }

}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac NotificationUpdate.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java NotificationUpdate
Exam rescheduled
*/